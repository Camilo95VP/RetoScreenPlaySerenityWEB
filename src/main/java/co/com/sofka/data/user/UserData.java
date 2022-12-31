package co.com.sofka.data.user;

import co.com.sofka.models.UserModel;
import com.github.javafaker.Faker;

import java.util.Locale;

public class UserData extends UserModel {

    public static UserModel userModel(){
        Faker fk= Faker.instance(new Locale("es-ES"));
        UserModel userModel=new UserModel();
        userModel.setDocument(fk.number().digits(10));
        userModel.setEmail(fk.internet().safeEmailAddress());
        userModel.setName(fk.name().firstName());
        userModel.setLastName(fk.name().lastName());
        userModel.setAddress(fk.address().fullAddress());
        userModel.setPhone(fk.number().digits(10));
        return userModel;
    }

}
