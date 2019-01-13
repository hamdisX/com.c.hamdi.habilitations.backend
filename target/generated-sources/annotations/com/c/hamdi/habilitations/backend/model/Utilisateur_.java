package com.c.hamdi.habilitations.backend.model;

import com.c.hamdi.habilitations.backend.model.UsersGroup;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T17:42:25")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> password;
    public static volatile CollectionAttribute<Utilisateur, UsersGroup> usersGroupCollection;
    public static volatile SingularAttribute<Utilisateur, Integer> id;
    public static volatile SingularAttribute<Utilisateur, String> email;
    public static volatile SingularAttribute<Utilisateur, String> username;

}