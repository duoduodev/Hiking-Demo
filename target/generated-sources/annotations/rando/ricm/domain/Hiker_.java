package rando.ricm.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rando.ricm.domain.enumeration.Sex;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hiker.class)
public abstract class Hiker_ {

	public static volatile SingularAttribute<Hiker, String> firstname;
	public static volatile SingularAttribute<Hiker, LocalDate> birthdate;
	public static volatile SingularAttribute<Hiker, Sex> sex;
	public static volatile SingularAttribute<Hiker, String> name;
	public static volatile SingularAttribute<Hiker, String> phonenumber;
	public static volatile SetAttribute<Hiker, Hike> itineraries;
	public static volatile SingularAttribute<Hiker, Integer> weight;
	public static volatile SetAttribute<Hiker, Message> positions;
	public static volatile SingularAttribute<Hiker, Long> id;
	public static volatile SingularAttribute<Hiker, Integer> anaerobicmaximumspeed;
	public static volatile SingularAttribute<Hiker, User> user;

}

