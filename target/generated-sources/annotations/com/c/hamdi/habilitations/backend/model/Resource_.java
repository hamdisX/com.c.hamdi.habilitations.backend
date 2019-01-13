package com.c.hamdi.habilitations.backend.model;

import com.c.hamdi.habilitations.backend.model.Privilege;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-13T17:42:25")
@StaticMetamodel(Resource.class)
public class Resource_ { 

    public static volatile SingularAttribute<Resource, String> description;
    public static volatile CollectionAttribute<Resource, Privilege> privilegeCollection;
    public static volatile SingularAttribute<Resource, Integer> id;
    public static volatile SingularAttribute<Resource, String> label;

}