package com.how2java.test;

import com.how2java.pojo.*;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import sun.plugin.perf.PluginRollup;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TestHibernate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session s = sessionFactory.openSession();
        s.beginTransaction();

//        //增加3个用户
        Set<User2> users = new HashSet();
        for (int i =10; i < 13; i++) {
            User2 u = (User2) s.get(User2.class, i);
            users.add(u);
        }

        //产品1被用户1,2,3购买
        Product2 p1 = (Product2) s.get(Product2.class, 4);
        p1.setUsers(users);
        s.getTransaction().commit();
        s.close();
        sessionFactory.close();

    }
}


//    Category2 category2 = (Category2) s.get(Category2.class, 3);
//    Set<Product2> product2s = category2.getProducts();
//        for (Product2 product2 : product2s) {
//                System.out.println(product2);
//                }

//    Product product = (Product) s.get(Product.class, 1);
//        product.setPrice(product.getPrice() + 1000);
//
//                s.save(product);


//       Session s2=sessionFactory.openSession();
//        s2.beginTransaction();
//        Product product1=(Product)s2.get(Product.class,1);
//        product1.setPrice(product1.getPrice()+1000);
//        s2.save(product1);
//        s2.getTransaction().commit();

//    String name="iphone";
//    Query query=s.createQuery("select count(*) from Product p where p.name  like ? ");
//        query.setString(0,"%"+name+"%");
//                long total=(Long)query.uniqueResult();
//                System.out.println(total);

//        String name = "iphone";
//        Query query = s.createQuery("from Product p where p.name like ?");
//        query.setString(0,"%"+name+"%");
//        Iterator<Product> iterator=query.iterate();
//        while (iterator.hasNext()){
//            Product product= iterator.next();
//            System.out.println(product.getName());
//        }

//    Product p3 = (Product) s.get(Product.class, 1);
//        p3.setName("fsdjkljkl");
//                s.update(p3);
//                System.out.println("p3=" + p3);
//
//                Product p4 = (Product) s.load(Product.class, 500);
//        System.out.println("p3=" + p4);

//        for (int i = 0; i < 10; i++) {
//            Product product = new Product();
//            product.setName("iphone " + i);
//            product.setPrice(5000);
//            if (i < 5) {
//                product.setCategory((Category) session.get(Category.class, 1));
//            } else {
//                product.setCategory((Category) session.get(Category.class, 2));
//            }
//            session.save(product);
//        }

//        String name="product";
//        Criteria criteria=session.createCriteria(Product.class);
//        criteria.add(Restrictions.like("name","%"+name+"%"));
//        criteria.setFirstResult(2);
//        criteria.setMaxResults(5);
//        List<Product>products=criteria.list();
//        for(Product product:products){
//            System.out.println(product);
//        }

//
//        Category category1 = (Category) session.get(Category.class, 1);
//        System.out.println("log1");
//        Category category2 = (Category) session.get(Category.class, 1);
//        System.out.println("log2");
//        Session session2 = sessionFactory.openSession();
//        session2.beginTransaction();
//        Category category3 = (Category) session2.get(Category.class, 1);
//        session2.getTransaction().commit();
//        session2.close();

//        Category category = (Category) session.get(Category.class, 2);
//        for (int i = 5; i <= 10; i++) {
//            Product product = new Product();
//            product.setName("product" + i);
//            product.setPrice(8000);
//            category.getProducts().add(product);
//        }

//
//        Category category=(Category)session.get(Category.class,2);
//        session.delete(category);


//        Category category = (Category) session.load(Category.class, 1);
//        Set<Product> products = category.getProducts();
//        System.out.println("log1");
//        System.out.println(products);

//    Product product=(Product)session.load(Product.class,1);
//        System.out.println("log1");
//                System.out.println(product.getName());
//                System.out.println("log2");

//    Product p = (Product) session.get(Product.class, 1);
//        session.delete(p);
//
//                Product p1 = (Product) session.get(Product.class, 2);
//        p1.setName("fdjsklf");
//        session.update(p1);

//    Set<User> users = new HashSet<>();
//        for (int i = 0; i < 3; i++) {
//        User u = new User();
//        u.setName("user" + i);
//        users.add(u);
//        session.save(u);
//        }
//
//        Product product = (Product) session.get(Product.class, 1);
//        product.setUsers(users);
//        session.save(product);

//    Category category=(Category)session.get(Category.class,1);
//    Set<Product> products=category.getProducts();
//        for(Product product:products){
//                System.out.println(product);
//                }


//    Category category=new Category();
//        category.setName("c1");
//                session.save(category);
//                Product p=(Product)session.get(Product.class,6);
//        p.setCategory(category);
//        session.update(p);

//    String name = "iphone";
//    String sql = "select * from product_ p where p.name like '%" + name + "%'";
//    Query q = session.createSQLQuery(sql);
//    List<Object[]> list = q.list();
//        for (Object[] object : list) {
//                for (Object field : object) {
//                System.out.print(field+" ");
//                }
//                System.out.println();
//                }


//    String name = "iphone";
//    Criteria criteria = session.createCriteria(Product.class);
//        criteria.add(Restrictions.like("name", "%" + name + "%"));
//                List<Product> products = criteria.list();
//        for (Product product : products) {
//        System.out.println(product);
//        }

//        String name="product";
//        Query query=session.createQuery("from Product p where p.name like ?");
//        query.setString(0,"%"+name+"%");
//
//        List<Product> productList=query.list();
//        for(Product product:productList){
//            System.out.println(product);
//    }


//        Product product=new Product(6,"iphone7",7000);
//        product.setName("new name");
//        session.update(product);


//        for (int i = 0; i < 10; i++) {
//            Product product = new Product("product" + i, 7000);
//            session.save(product);
//        }


