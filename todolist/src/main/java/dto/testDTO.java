package dto;

/**
 * Created by svetlana on 23.04.2015.
 */
public class testDTO {
    public static void main(String[] args) {

        User user = new User();
        user.setUserID(1);
        user.setFirstName("Sveta");
        user.setLastName("Krizhniy");
        user.setEmail("Fotinia1211@mail.ru");
        user.setPassword("qwerty");
        System.out.println(user);

        User boy = new User();
        boy.setUserID(1);
        boy.setFirstName("Sveta");
        boy.setLastName("Krizhniy");
        boy.setEmail("Fotinia1211@mail.ru");
        boy.setPassword("qwerty");

        System.out.println(user.equals(boy));

    }

}
