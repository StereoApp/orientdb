/* Generated By:JJTree: Do not edit this line. OIsNullCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.command.OCommandContext;
import com.orientechnologies.orient.core.db.record.OIdentifiable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class OIsNullCondition extends OBooleanExpression {

  protected OExpression expression;

  public OIsNullCondition(int id) {
    super(id);
  }

  public OIsNullCondition(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override
  public boolean evaluate(OIdentifiable currentRecord, OCommandContext ctx) {
    return false;
  }

  public OExpression getExpression() {
    return expression;
  }

  public void setExpression(OExpression expression) {
    this.expression = expression;
  }

  @Override
  public String toString() {
    return expression.toString() + " is null";
  }

  @Override
  public void replaceParameters(Map<Object, Object> params) {
    expression.replaceParameters(params);
  }

  @Override
  public boolean supportsBasicCalculation() {
    return expression.supportsBasicCalculation();
  }

  @Override
  protected int getNumberOfExternalCalculations() {
    if (expression.supportsBasicCalculation()) {
      return 0;
    }
    return 1;
  }

  @Override
  protected List<Object> getExternalCalculationConditions() {
    if (expression.supportsBasicCalculation()) {
      return Collections.EMPTY_LIST;
    }
    return (List) Collections.singletonList(expression);
  }

}
/* JavaCC - OriginalChecksum=29ebbc506a98f90953af91a66a03aa1e (do not edit this line) */
