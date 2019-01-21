package com.miaoshaproject.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author Sidney 2019-01-03.
 */
@Component
public class ValidatorImpl implements InitializingBean {
    private Validator validator;
    //实现校验方法并返回校验结果
    public ValidationResult validate(Object bean) {
        final ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(bean);
        if (constraintViolationSet.size() > 0) {
            //有错误
            result.setHasError(true);
            constraintViolationSet.forEach(constraintViolation->{
                String errMsg = constraintViolation.getMessage();
                String propertyName = constraintViolation.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertyName,errMsg);
            });

        }
        return result;

    }
    @Override
    public void afterPropertiesSet() throws Exception {
        //将hibernate validation通过工厂的初始化方法使其实例化
        this.validator= Validation.buildDefaultValidatorFactory().getValidator();
    }
}
