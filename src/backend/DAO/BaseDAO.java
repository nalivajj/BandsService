package backend.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;

public abstract class BaseDAO<T> {

    @Autowired
    public SessionFactory sessionFactory;

    private Class<T> reflectiveClass;

    public BaseDAO(){
        this.reflectiveClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void save(T entity){
        getCurrentSession().save(entity);
    }

    public T get(int id){
        return getCurrentSession().get(reflectiveClass, id);
    }

    public void update(T entity){
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(T entity){
        getCurrentSession().delete(entity);
    }

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
