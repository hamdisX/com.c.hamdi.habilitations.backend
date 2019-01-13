package com.c.hamdi.habilitations.backend.model;

import com.c.hamdi.habilitations.backend.model.Profile;
import com.c.hamdi.habilitations.backend.model.Resource;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T17:42:25")
@StaticMetamodel(Privilege.class)
public class Privilege_ { 

    public static volatile SingularAttribute<Privilege, Resource> resourceId;
    public static volatile SingularAttribute<Privilege, Profile> profileId;
    public static volatile SingularAttribute<Privilege, Integer> id;
    public static volatile SingularAttribute<Privilege, String> label;

}