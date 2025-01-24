package service;

import model.Contact;

public interface IContactService {
    void showContact();
    boolean addContact();
    boolean updateContact();
    boolean deleteContact();
    void findContact();
    void readAllContact();
}
