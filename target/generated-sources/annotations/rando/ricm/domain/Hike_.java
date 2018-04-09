package rando.ricm.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hike.class)
public abstract class Hike_ {

	public static volatile SingularAttribute<Hike, Integer> duration;
	public static volatile SingularAttribute<Hike, ZonedDateTime> date;
	public static volatile SetAttribute<Hike, Hiker> walkers;
	public static volatile SingularAttribute<Hike, String> hikename;
	public static volatile SetAttribute<Hike, Message> messages;
	public static volatile SingularAttribute<Hike, Integer> positivedrop;
	public static volatile SingularAttribute<Hike, Long> id;
	public static volatile SingularAttribute<Hike, String> meetingplace;

}

