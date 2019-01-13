package com.c.hamdi.habilitations.backend.model;

import com.c.hamdi.habilitations.backend.model.Privilege;
import com.c.hamdi.habilitations.backend.model.UsersGroup;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T17:42:25")
@StaticMetamodel(Profile.class)
public class Profile_ { 

    public static volatile SingularAttribute<Profile, String> description;
    public static volatile CollectionAttribute<Profile, Privilege> privilegeCollection;
    public static volatile CollectionAttribute<Profile, UsersGroup> usersGroupCollection;
    public static volatile SingularAttribute<Profile, Integer> id;
    public static volatile SingularAttribute<Profile, String> label;

}