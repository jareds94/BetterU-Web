package com.mycompany.entitypackage;

import com.mycompany.entitypackage.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-05T17:56:39")
@StaticMetamodel(Photo.class)
public class Photo_ { 

    public static volatile SingularAttribute<Photo, String> extension;
    public static volatile SingularAttribute<Photo, Integer> id;
    public static volatile SingularAttribute<Photo, User> userId;

}