package com.c.hamdi.habilitations.backend.model;

import com.c.hamdi.habilitations.backend.model.Profile;
import com.c.hamdi.habilitations.backend.model.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T17:42:25")
@StaticMetamodel(UsersGroup.class)
public class UsersGroup_ { 

    public static volatile CollectionAttribute<UsersGroup, User> userCollection;
    public static volatile SingularAttribute<UsersGroup, Integer> id;
    public static volatile SingularAttribute<UsersGroup, String> label;
    public static volatile SingularAttribute<UsersGroup, Date> creationDate;
    public static volatile CollectionAttribute<UsersGroup, Profile> profileCollection;

}