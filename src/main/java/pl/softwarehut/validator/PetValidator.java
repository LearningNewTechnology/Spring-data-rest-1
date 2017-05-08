package pl.softwarehut.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import pl.softwarehut.model.Pet;

public class PetValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Pet.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        final Pet pet = (Pet) object;
        if (StringUtils.isEmpty(pet.getName())) {
            errors.rejectValue("name", "name.empty");
        }
    }
}
