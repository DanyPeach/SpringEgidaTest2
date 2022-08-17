package com.eg.repository.impl;

import com.eg.model.User;
import com.eg.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void edit(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public User getUser(String login) {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query =  session.createQuery("from User u where u.login=:login", User.class);
        query.setParameter("login", login);
        return query.uniqueResult();
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(User.class, login);
//          этот способ берет юзика по айдишнику
    }

    @Override
    public User getUserById(int id) {
          Session session = sessionFactory.getCurrentSession();
          return session.get(User.class, id);
    }
}
