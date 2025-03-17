package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class UseBookingService {

    private User user;
     private List<User> userList;
    private static final String USERS_PATH ="C:\\Users\\Kiran\\Desktop\\IRCTC\\app\\src\\main\\java\\ticket\\booking\\localDb\\users.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();


    public UseBookingService(User user1) throws IOException {
 this.user= user1;

        File users = new File(USERS_PATH);
userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});


    }
public Boolean loginUser(){
    Optional<User> foundUser = userList.stream().filter(user1 -> {
        return user1.getName().equals(user.getName()) && UserServiceUtil.checkpassword(user.getPassword(),user1.)
    }
}
    public boolean signUp(User user1){

    }
}
