package org.avaje.test.model.rawsql.inherit;

import io.ebean.annotation.Sql;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Sql
public class ParentAggregate {

  @OneToOne
  public Parent parent;

}
