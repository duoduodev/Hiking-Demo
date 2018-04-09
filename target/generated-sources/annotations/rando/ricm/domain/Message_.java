package rando.ricm.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Message.class)
public abstract class Message_ {

	public static volatile SingularAttribute<Message, ZonedDateTime> datetime;
	public static volatile SingularAttribute<Message, Boolean> espON;
	public static volatile SingularAttribute<Message, Hiker> sender;
	public static volatile SingularAttribute<Message, Boolean> sos;
	public static volatile SingularAttribute<Message, Integer> heartrate;
	public static volatile SingularAttribute<Message, Double> latitude;
	public static volatile SingularAttribute<Message, Long> id;
	public static volatile SingularAttribute<Message, Hike> hike;
	public static volatile SingularAttribute<Message, Double> longitude;

}

