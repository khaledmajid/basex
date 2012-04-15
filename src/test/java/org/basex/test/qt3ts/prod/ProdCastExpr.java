package org.basex.test.qt3ts.prod;

import org.basex.tests.bxapi.XQuery;
import org.basex.test.qt3ts.QT3TestSet;

/**
 * Tests for the cast expression.
 *
 * @author BaseX Team 2005-12, BSD License
 * @author Leo Woerteler
 */
@SuppressWarnings("all")
public class ProdCastExpr extends QT3TestSet {

  /**
   * Try casting xs:untypedAtomic(INF) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs001() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"INF\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:untypedAtomic(0.0E0) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs002() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"0.0E0\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.0E0")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs003() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:untypedAtomic(INF) to xs:string.
   */
  @org.junit.Test
  public void castAs004() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"INF\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:untypedAtomic(0.0E0) to xs:string.
   */
  @org.junit.Test
  public void castAs005() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"0.0E0\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.0E0")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:string.
   */
  @org.junit.Test
  public void castAs006() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0.0E0) to xs:float.
   */
  @org.junit.Test
  public void castAs007() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-0.0E0\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-0")
    );
  }

  /**
   * Try casting xs:untypedAtomic(NaN) to xs:float.
   */
  @org.junit.Test
  public void castAs008() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"NaN\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1e-5) to xs:float.
   */
  @org.junit.Test
  public void castAs009() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1e-5\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.00001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-10000000) to xs:float.
   */
  @org.junit.Test
  public void castAs010() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-10000000\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.0E7")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:float.
   */
  @org.junit.Test
  public void castAs011() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0.0E0) to xs:double.
   */
  @org.junit.Test
  public void castAs012() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-0.0E0\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-0")
    );
  }

  /**
   * Try casting xs:untypedAtomic(NaN) to xs:double.
   */
  @org.junit.Test
  public void castAs013() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"NaN\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1e-5) to xs:double.
   */
  @org.junit.Test
  public void castAs014() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1e-5\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.00001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-10000000) to xs:double.
   */
  @org.junit.Test
  public void castAs015() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-10000000\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.0E7")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:double.
   */
  @org.junit.Test
  public void castAs016() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0.0E0) to xs:decimal.
   */
  @org.junit.Test
  public void castAs017() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-0.0E0\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(NaN) to xs:decimal.
   */
  @org.junit.Test
  public void castAs018() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"NaN\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1e-5) to xs:decimal.
   */
  @org.junit.Test
  public void castAs019() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1e-5\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(5.5432) to xs:decimal.
   */
  @org.junit.Test
  public void castAs020() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"5.5432\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "5.5432")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:decimal.
   */
  @org.junit.Test
  public void castAs021() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0.0E0) to xs:integer.
   */
  @org.junit.Test
  public void castAs022() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-0.0E0\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(NaN) to xs:integer.
   */
  @org.junit.Test
  public void castAs023() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"NaN\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1e-5) to xs:integer.
   */
  @org.junit.Test
  public void castAs024() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1e-5\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-1.1234) to xs:integer.
   */
  @org.junit.Test
  public void castAs025() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-1.1234\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:integer.
   */
  @org.junit.Test
  public void castAs026() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(P1Y2M3DT10H30M23S) to xs:duration.
   */
  @org.junit.Test
  public void castAs027() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"P1Y2M3DT10H30M23S\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M3DT10H30M23S")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-P1Y1M1DT1H1M1.123S) to xs:duration.
   */
  @org.junit.Test
  public void castAs028() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-P1Y1M1DT1H1M1.123S\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-P1Y1M1DT1H1M1.123S")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:duration.
   */
  @org.junit.Test
  public void castAs029() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-P1Y1M1DT1H1M1.123S) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs030() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-P1Y1M1DT1H1M1.123S\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(P24M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs031() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"P24M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P2Y")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-P21M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs032() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-P21M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-P1Y9M")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs033() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-P1Y1M1DT1H1M1.123S) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs034() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-P1Y1M1DT1H1M1.123S\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(P3DT10H30M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs035() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"P3DT10H30M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P3DT10H30M")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-PT100M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs036() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-PT100M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-PT1H40M")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs037() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1999-05-31T13:20:00) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs038() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1999-05-31T13:20:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T13:20:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-1999-05-31T13:20:00+14:00) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs039() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-1999-05-31T13:20:00+14:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1999-05-31T13:20:00+14:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(2000-01-16T00:00:00Z) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs040() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"2000-01-16T00:00:00Z\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "2000-01-16T00:00:00Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs041() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(13:20:00-05:00) to xs:time.
   */
  @org.junit.Test
  public void castAs042() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"13:20:00-05:00\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00-05:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(13:20:02.123) to xs:time.
   */
  @org.junit.Test
  public void castAs043() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"13:20:02.123\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:02.123")
    );
  }

  /**
   * Try casting xs:untypedAtomic(13:20:00Z) to xs:time.
   */
  @org.junit.Test
  public void castAs044() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"13:20:00Z\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:time.
   */
  @org.junit.Test
  public void castAs045() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1999-05-31) to xs:date.
   */
  @org.junit.Test
  public void castAs046() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1999-05-31\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0012-12-03-05:00) to xs:date.
   */
  @org.junit.Test
  public void castAs047() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-0012-12-03-05:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-03-05:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1999-05-31Z) to xs:date.
   */
  @org.junit.Test
  public void castAs048() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1999-05-31Z\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:date.
   */
  @org.junit.Test
  public void castAs049() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1999-05) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs050() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1999-05\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0012-12-05:00) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs051() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-0012-12-05:00\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-05:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1999-05Z) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs052() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1999-05Z\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs053() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1999) to xs:gYear.
   */
  @org.junit.Test
  public void castAs054() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1999\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0012-05:00) to xs:gYear.
   */
  @org.junit.Test
  public void castAs055() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"-0012-05:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-05:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(1999Z) to xs:gYear.
   */
  @org.junit.Test
  public void castAs056() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"1999Z\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:gYear.
   */
  @org.junit.Test
  public void castAs057() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(--05-31) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs058() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"--05-31\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31")
    );
  }

  /**
   * Try casting xs:untypedAtomic(--05-31+14:00) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs059() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"--05-31+14:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31+14:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(--05-31Z) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs060() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"--05-31Z\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs061() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(---31) to xs:gDay.
   */
  @org.junit.Test
  public void castAs062() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"---31\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31")
    );
  }

  /**
   * Try casting xs:untypedAtomic(---03-05:00) to xs:gDay.
   */
  @org.junit.Test
  public void castAs063() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"---03-05:00\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---03-05:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(---31Z) to xs:gDay.
   */
  @org.junit.Test
  public void castAs064() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"---31Z\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:gDay.
   */
  @org.junit.Test
  public void castAs065() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(--05) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs066() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"--05\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05")
    );
  }

  /**
   * Try casting xs:untypedAtomic(--12-05:00) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs067() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"--12-05:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--12-05:00")
    );
  }

  /**
   * Try casting xs:untypedAtomic(--05Z) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs068() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"--05Z\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05Z")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs069() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(0.0) to xs:boolean.
   */
  @org.junit.Test
  public void castAs070() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"0.0\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(0) to xs:boolean.
   */
  @org.junit.Test
  public void castAs071() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"0\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:boolean.
   */
  @org.junit.Test
  public void castAs072() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs073() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:untypedAtomic(00000000) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs074() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"00000000\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "00000000")
    );
  }

  /**
   * Try casting xs:untypedAtomic(D74D35D35D35) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs075() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"D74D35D35D35\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs076() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(010010101) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs077() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"010010101\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:untypedAtomic(0fb7) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs078() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"0fb7\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0FB7")
    );
  }

  /**
   * Try casting xs:untypedAtomic(D74D35D35D35) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs079() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"D74D35D35D35\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:untypedAtomic(-0012-05:00) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs080() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"http://www.example.com/~b%C3%A9b%C3%A9\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://www.example.com/~b%C3%A9b%C3%A9")
    );
  }

  /**
   * Try casting xs:untypedAtomic(true) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs081() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"true\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:untypedAtomic(http://www.ietf.org/rfc/rfc2396.txt) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs082() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://www.ietf.org/rfc/rfc2396.txt")
    );
  }

  /**
   * Try casting xs:string(INF) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs083() {
    final XQuery query = new XQuery(
      "xs:string(\"INF\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:string(0.0E0) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs084() {
    final XQuery query = new XQuery(
      "xs:string(\"0.0E0\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.0E0")
    );
  }

  /**
   * Try casting xs:string(true) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs085() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:string(INF) to xs:string.
   */
  @org.junit.Test
  public void castAs086() {
    final XQuery query = new XQuery(
      "xs:string(\"INF\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:string(0.0E0) to xs:string.
   */
  @org.junit.Test
  public void castAs087() {
    final XQuery query = new XQuery(
      "xs:string(\"0.0E0\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.0E0")
    );
  }

  /**
   * Try casting xs:string(true) to xs:string.
   */
  @org.junit.Test
  public void castAs088() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:string(-0.0E0) to xs:float.
   */
  @org.junit.Test
  public void castAs089() {
    final XQuery query = new XQuery(
      "xs:string(\"-0.0E0\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-0")
    );
  }

  /**
   * Try casting xs:string(NaN) to xs:float.
   */
  @org.junit.Test
  public void castAs090() {
    final XQuery query = new XQuery(
      "xs:string(\"NaN\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   * Try casting xs:string(1e-5) to xs:float.
   */
  @org.junit.Test
  public void castAs091() {
    final XQuery query = new XQuery(
      "xs:string(\"1e-5\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.00001")
    );
  }

  /**
   * Try casting xs:string(-10000000) to xs:float.
   */
  @org.junit.Test
  public void castAs092() {
    final XQuery query = new XQuery(
      "xs:string(\"-10000000\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.0E7")
    );
  }

  /**
   * Try casting xs:string(true) to xs:float.
   */
  @org.junit.Test
  public void castAs093() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(-0.0E0) to xs:double.
   */
  @org.junit.Test
  public void castAs094() {
    final XQuery query = new XQuery(
      "xs:string(\"-0.0E0\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-0")
    );
  }

  /**
   * Try casting xs:string(NaN) to xs:double.
   */
  @org.junit.Test
  public void castAs095() {
    final XQuery query = new XQuery(
      "xs:string(\"NaN\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   * Try casting xs:string(1e-5) to xs:double.
   */
  @org.junit.Test
  public void castAs096() {
    final XQuery query = new XQuery(
      "xs:string(\"1e-5\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0.00001")
    );
  }

  /**
   * Try casting xs:string(-10000000) to xs:double.
   */
  @org.junit.Test
  public void castAs097() {
    final XQuery query = new XQuery(
      "xs:string(\"-10000000\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.0E7")
    );
  }

  /**
   * Try casting xs:string(true) to xs:double.
   */
  @org.junit.Test
  public void castAs098() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(-0.0E0) to xs:decimal.
   */
  @org.junit.Test
  public void castAs099() {
    final XQuery query = new XQuery(
      "xs:string(\"-0.0E0\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(NaN) to xs:decimal.
   */
  @org.junit.Test
  public void castAs100() {
    final XQuery query = new XQuery(
      "xs:string(\"NaN\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(1e-5) to xs:decimal.
   */
  @org.junit.Test
  public void castAs101() {
    final XQuery query = new XQuery(
      "xs:string(\"1e-5\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(5.5432) to xs:decimal.
   */
  @org.junit.Test
  public void castAs102() {
    final XQuery query = new XQuery(
      "xs:string(\"5.5432\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "5.5432")
    );
  }

  /**
   * Try casting xs:string(true) to xs:decimal.
   */
  @org.junit.Test
  public void castAs103() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(-0.0E0) to xs:integer.
   */
  @org.junit.Test
  public void castAs104() {
    final XQuery query = new XQuery(
      "xs:string(\"-0.0E0\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(NaN) to xs:integer.
   */
  @org.junit.Test
  public void castAs105() {
    final XQuery query = new XQuery(
      "xs:string(\"NaN\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(1e-5) to xs:integer.
   */
  @org.junit.Test
  public void castAs106() {
    final XQuery query = new XQuery(
      "xs:string(\"1e-5\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(-1.1234) to xs:integer.
   */
  @org.junit.Test
  public void castAs107() {
    final XQuery query = new XQuery(
      "xs:string(\"-1.1234\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(true) to xs:integer.
   */
  @org.junit.Test
  public void castAs108() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(P1Y2M3DT10H30M23S) to xs:duration.
   */
  @org.junit.Test
  public void castAs109() {
    final XQuery query = new XQuery(
      "xs:string(\"P1Y2M3DT10H30M23S\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M3DT10H30M23S")
    );
  }

  /**
   * Try casting xs:string(-P1Y1M1DT1H1M1.123S) to xs:duration.
   */
  @org.junit.Test
  public void castAs110() {
    final XQuery query = new XQuery(
      "xs:string(\"-P1Y1M1DT1H1M1.123S\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-P1Y1M1DT1H1M1.123S")
    );
  }

  /**
   * Try casting xs:string(true) to xs:duration.
   */
  @org.junit.Test
  public void castAs111() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(-P1Y1M1DT1H1M1.123S) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs112() {
    final XQuery query = new XQuery(
      "xs:string(\"-P1Y1M1DT1H1M1.123S\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(P24M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs113() {
    final XQuery query = new XQuery(
      "xs:string(\"P24M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P2Y")
    );
  }

  /**
   * Try casting xs:string(-P21M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs114() {
    final XQuery query = new XQuery(
      "xs:string(\"-P21M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-P1Y9M")
    );
  }

  /**
   * Try casting xs:string(true) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs115() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(-P1Y1M1DT1H1M1.123S) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs116() {
    final XQuery query = new XQuery(
      "xs:string(\"-P1Y1M1DT1H1M1.123S\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(P3DT10H30M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs117() {
    final XQuery query = new XQuery(
      "xs:string(\"P3DT10H30M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P3DT10H30M")
    );
  }

  /**
   * Try casting xs:string(-PT100M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs118() {
    final XQuery query = new XQuery(
      "xs:string(\"-PT100M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-PT1H40M")
    );
  }

  /**
   * Try casting xs:string(true) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs119() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(1999-05-31T13:20:00) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs120() {
    final XQuery query = new XQuery(
      "xs:string(\"1999-05-31T13:20:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T13:20:00")
    );
  }

  /**
   * Try casting xs:string(-1999-05-31T13:20:00+14:00) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs121() {
    final XQuery query = new XQuery(
      "xs:string(\"-1999-05-31T13:20:00+14:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1999-05-31T13:20:00+14:00")
    );
  }

  /**
   * Try casting xs:string(2000-01-16T00:00:00Z) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs122() {
    final XQuery query = new XQuery(
      "xs:string(\"2000-01-16T00:00:00Z\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "2000-01-16T00:00:00Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs123() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(13:20:00-05:00) to xs:time.
   */
  @org.junit.Test
  public void castAs124() {
    final XQuery query = new XQuery(
      "xs:string(\"13:20:00-05:00\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00-05:00")
    );
  }

  /**
   * Try casting xs:string(13:20:02.123) to xs:time.
   */
  @org.junit.Test
  public void castAs125() {
    final XQuery query = new XQuery(
      "xs:string(\"13:20:02.123\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:02.123")
    );
  }

  /**
   * Try casting xs:string(13:20:00Z) to xs:time.
   */
  @org.junit.Test
  public void castAs126() {
    final XQuery query = new XQuery(
      "xs:string(\"13:20:00Z\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:time.
   */
  @org.junit.Test
  public void castAs127() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(1999-05-31) to xs:date.
   */
  @org.junit.Test
  public void castAs128() {
    final XQuery query = new XQuery(
      "xs:string(\"1999-05-31\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   * Try casting xs:string(-0012-12-03-05:00) to xs:date.
   */
  @org.junit.Test
  public void castAs129() {
    final XQuery query = new XQuery(
      "xs:string(\"-0012-12-03-05:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-03-05:00")
    );
  }

  /**
   * Try casting xs:string(1999-05-31Z) to xs:date.
   */
  @org.junit.Test
  public void castAs130() {
    final XQuery query = new XQuery(
      "xs:string(\"1999-05-31Z\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:date.
   */
  @org.junit.Test
  public void castAs131() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(1999-05) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs132() {
    final XQuery query = new XQuery(
      "xs:string(\"1999-05\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05")
    );
  }

  /**
   * Try casting xs:string(-0012-12-05:00) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs133() {
    final XQuery query = new XQuery(
      "xs:string(\"-0012-12-05:00\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-05:00")
    );
  }

  /**
   * Try casting xs:string(1999-05Z) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs134() {
    final XQuery query = new XQuery(
      "xs:string(\"1999-05Z\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs135() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(1999) to xs:gYear.
   */
  @org.junit.Test
  public void castAs136() {
    final XQuery query = new XQuery(
      "xs:string(\"1999\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999")
    );
  }

  /**
   * Try casting xs:string(-0012-05:00) to xs:gYear.
   */
  @org.junit.Test
  public void castAs137() {
    final XQuery query = new XQuery(
      "xs:string(\"-0012-05:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-05:00")
    );
  }

  /**
   * Try casting xs:string(1999Z) to xs:gYear.
   */
  @org.junit.Test
  public void castAs138() {
    final XQuery query = new XQuery(
      "xs:string(\"1999Z\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:gYear.
   */
  @org.junit.Test
  public void castAs139() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(--05-31) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs140() {
    final XQuery query = new XQuery(
      "xs:string(\"--05-31\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31")
    );
  }

  /**
   * Try casting xs:string(--05-31+14:00) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs141() {
    final XQuery query = new XQuery(
      "xs:string(\"--05-31+14:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31+14:00")
    );
  }

  /**
   * Try casting xs:string(--05-31Z) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs142() {
    final XQuery query = new XQuery(
      "xs:string(\"--05-31Z\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs143() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(---31) to xs:gDay.
   */
  @org.junit.Test
  public void castAs144() {
    final XQuery query = new XQuery(
      "xs:string(\"---31\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31")
    );
  }

  /**
   * Try casting xs:string(---03-05:00) to xs:gDay.
   */
  @org.junit.Test
  public void castAs145() {
    final XQuery query = new XQuery(
      "xs:string(\"---03-05:00\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---03-05:00")
    );
  }

  /**
   * Try casting xs:string(---31Z) to xs:gDay.
   */
  @org.junit.Test
  public void castAs146() {
    final XQuery query = new XQuery(
      "xs:string(\"---31Z\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:gDay.
   */
  @org.junit.Test
  public void castAs147() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(--05) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs148() {
    final XQuery query = new XQuery(
      "xs:string(\"--05\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05")
    );
  }

  /**
   * Try casting xs:string(--12-05:00) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs149() {
    final XQuery query = new XQuery(
      "xs:string(\"--12-05:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--12-05:00")
    );
  }

  /**
   * Try casting xs:string(--05Z) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs150() {
    final XQuery query = new XQuery(
      "xs:string(\"--05Z\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05Z")
    );
  }

  /**
   * Try casting xs:string(true) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs151() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(0.0) to xs:boolean.
   */
  @org.junit.Test
  public void castAs152() {
    final XQuery query = new XQuery(
      "xs:string(\"0.0\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(0) to xs:boolean.
   */
  @org.junit.Test
  public void castAs153() {
    final XQuery query = new XQuery(
      "xs:string(\"0\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * Try casting xs:string(true) to xs:boolean.
   */
  @org.junit.Test
  public void castAs154() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:string(true) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs155() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:string(00000000) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs156() {
    final XQuery query = new XQuery(
      "xs:string(\"00000000\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "00000000")
    );
  }

  /**
   * Try casting xs:string(D74D35D35D35) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs157() {
    final XQuery query = new XQuery(
      "xs:string(\"D74D35D35D35\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:string(true) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs158() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(010010101) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs159() {
    final XQuery query = new XQuery(
      "xs:string(\"010010101\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   * Try casting xs:string(0fb7) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs160() {
    final XQuery query = new XQuery(
      "xs:string(\"0fb7\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0FB7")
    );
  }

  /**
   * Try casting xs:string(D74D35D35D35) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs161() {
    final XQuery query = new XQuery(
      "xs:string(\"D74D35D35D35\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:string(-0012-05:00) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs162() {
    final XQuery query = new XQuery(
      "xs:string(\"http://www.example.com/~b%C3%A9b%C3%A9\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://www.example.com/~b%C3%A9b%C3%A9")
    );
  }

  /**
   * Try casting xs:string(true) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs163() {
    final XQuery query = new XQuery(
      "xs:string(\"true\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:string(http://www.ietf.org/rfc/rfc2396.txt) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs164() {
    final XQuery query = new XQuery(
      "xs:string(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://www.ietf.org/rfc/rfc2396.txt")
    );
  }

  /**
   * Try casting xs:float(1e5) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs165() {
    final XQuery query = new XQuery(
      "xs:float(\"1e5\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "100000")
    );
  }

  /**
   * Try casting xs:float(-INF) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs166() {
    final XQuery query = new XQuery(
      "xs:float(\"-INF\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-INF")
    );
  }

  /**
   * Try casting xs:float(-0.0E0) to xs:string.
   */
  @org.junit.Test
  public void castAs167() {
    final XQuery query = new XQuery(
      "xs:float(\"-0.0E0\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0")
    );
  }

  /**
   * Try casting xs:float(NaN) to xs:string.
   */
  @org.junit.Test
  public void castAs168() {
    final XQuery query = new XQuery(
      "xs:float(\"NaN\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:float.
   */
  @org.junit.Test
  public void castAs169() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertEq("0")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(-1.75e-3) to xs:float.
   */
  @org.junit.Test
  public void castAs170() {
    final XQuery query = new XQuery(
      "xs:float(\"-1.75e-3\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0.00175")
    );
  }

  /**
   * Try casting xs:float(INF) to xs:float.
   */
  @org.junit.Test
  public void castAs171() {
    final XQuery query = new XQuery(
      "xs:float(\"INF\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:float(-0.0E0) to xs:double.
   */
  @org.junit.Test
  public void castAs172() {
    final XQuery query = new XQuery(
      "xs:float(\"-0.0E0\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-0")
    );
  }

  /**
   * Try casting xs:float(-INF) to xs:double.
   */
  @org.junit.Test
  public void castAs173() {
    final XQuery query = new XQuery(
      "xs:float(\"-INF\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-INF")
    );
  }

  /**
   * Try casting xs:float(-0.0E0) to xs:decimal.
   */
  @org.junit.Test
  public void castAs174() {
    final XQuery query = new XQuery(
      "xs:float(\"-0.0E0\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:decimal.
   */
  @org.junit.Test
  public void castAs175() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:float(1e5) to xs:decimal.
   */
  @org.junit.Test
  public void castAs176() {
    final XQuery query = new XQuery(
      "xs:float(\"1e5\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("100000")
    );
  }

  /**
   * Try casting xs:float(-1.75e-3) to xs:decimal.
   */
  @org.junit.Test
  public void castAs177() {
    final XQuery query = new XQuery(
      "round-half-to-even(xs:float(\"-1.75e-3\") cast as xs:decimal,5)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0.00175")
    );
  }

  /**
   * Try casting xs:float(-0.0E0) to xs:integer.
   */
  @org.junit.Test
  public void castAs178() {
    final XQuery query = new XQuery(
      "xs:float(\"-0.0E0\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:float(1e5) to xs:integer.
   */
  @org.junit.Test
  public void castAs179() {
    final XQuery query = new XQuery(
      "xs:float(\"1e5\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("100000")
    );
  }

  /**
   * Try casting xs:float(INF) to xs:integer.
   */
  @org.junit.Test
  public void castAs180() {
    final XQuery query = new XQuery(
      "xs:float(\"INF\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   * Try casting xs:float(-1.75e-3) to xs:duration.
   */
  @org.junit.Test
  public void castAs181() {
    final XQuery query = new XQuery(
      "xs:float(\"-1.75e-3\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs182() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs183() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs184() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:time.
   */
  @org.junit.Test
  public void castAs185() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:date.
   */
  @org.junit.Test
  public void castAs186() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs187() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:gYear.
   */
  @org.junit.Test
  public void castAs188() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs189() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:gDay.
   */
  @org.junit.Test
  public void castAs190() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs191() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(-0.0E0) to xs:boolean.
   */
  @org.junit.Test
  public void castAs192() {
    final XQuery query = new XQuery(
      "xs:float(\"-0.0E0\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * Try casting xs:float(1e5) to xs:boolean.
   */
  @org.junit.Test
  public void castAs193() {
    final XQuery query = new XQuery(
      "xs:float(\"1e5\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:float(-INF) to xs:boolean.
   */
  @org.junit.Test
  public void castAs194() {
    final XQuery query = new XQuery(
      "xs:float(\"-INF\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:float(NaN) to xs:boolean.
   */
  @org.junit.Test
  public void castAs195() {
    final XQuery query = new XQuery(
      "xs:float(\"NaN\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs196() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs197() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:float(5.4321E-100) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs198() {
    final XQuery query = new XQuery(
      "xs:float(\"5.4321E-100\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs199() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "100000")
    );
  }

  /**
   * Try casting xs:double(INF) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs200() {
    final XQuery query = new XQuery(
      "xs:double(\"INF\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:double(1e8) to xs:string.
   */
  @org.junit.Test
  public void castAs201() {
    final XQuery query = new XQuery(
      "xs:double(\"1e8\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1.0E8")
    );
  }

  /**
   * Try casting xs:double(INF) to xs:string.
   */
  @org.junit.Test
  public void castAs202() {
    final XQuery query = new XQuery(
      "xs:double(\"INF\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:double(-0.0E0) to xs:float.
   */
  @org.junit.Test
  public void castAs203() {
    final XQuery query = new XQuery(
      "xs:double(\"-0.0E0\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-0")
    );
  }

  /**
   * Try casting xs:double(5.4321E-1001) to xs:float.
   */
  @org.junit.Test
  public void castAs204() {
    final XQuery query = new XQuery(
      "xs:double(\"5.4321E-1001\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertEq("0")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:float.
   */
  @org.junit.Test
  public void castAs205() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("100000")
    );
  }

  /**
   * Try casting xs:double(-1.75e-3) to xs:float.
   */
  @org.junit.Test
  public void castAs206() {
    final XQuery query = new XQuery(
      "xs:double(\"-1.75e-3\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0.00175")
    );
  }

  /**
   * Try casting xs:double(NaN) to xs:float.
   */
  @org.junit.Test
  public void castAs207() {
    final XQuery query = new XQuery(
      "xs:double(\"NaN\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:double.
   */
  @org.junit.Test
  public void castAs208() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("100000")
    );
  }

  /**
   * Try casting xs:double(INF) to xs:double.
   */
  @org.junit.Test
  public void castAs209() {
    final XQuery query = new XQuery(
      "xs:double(\"INF\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   * Try casting xs:double(-0.0E0) to xs:decimal.
   */
  @org.junit.Test
  public void castAs210() {
    final XQuery query = new XQuery(
      "xs:double(\"-0.0E0\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:double(5.4321E-1001) to xs:decimal.
   */
  @org.junit.Test
  public void castAs211() {
    final XQuery query = new XQuery(
      "xs:double(\"5.4321E-1001\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:double(-1.75e-3) to xs:decimal.
   */
  @org.junit.Test
  public void castAs212() {
    final XQuery query = new XQuery(
      "round-half-to-even(xs:double(\"-1.75e-3\") cast as xs:decimal,5)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0.00175")
    );
  }

  /**
   * Try casting xs:double(INF) to xs:decimal.
   */
  @org.junit.Test
  public void castAs213() {
    final XQuery query = new XQuery(
      "xs:double(\"INF\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("FOCA0002")
      ||
        error("FORG0001")
      )
    );
  }

  /**
   * Try casting xs:double(-0.0E0) to xs:integer.
   */
  @org.junit.Test
  public void castAs214() {
    final XQuery query = new XQuery(
      "xs:double(\"-0.0E0\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:integer.
   */
  @org.junit.Test
  public void castAs215() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("100000")
    );
  }

  /**
   * Try casting xs:double(-1.75e-3) to xs:integer.
   */
  @org.junit.Test
  public void castAs216() {
    final XQuery query = new XQuery(
      "xs:double(\"-1.75e-3\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:double(INF) to xs:integer.
   */
  @org.junit.Test
  public void castAs217() {
    final XQuery query = new XQuery(
      "xs:double(\"INF\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   * Try casting xs:double(NaN) to xs:integer.
   */
  @org.junit.Test
  public void castAs218() {
    final XQuery query = new XQuery(
      "xs:double(\"NaN\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:duration.
   */
  @org.junit.Test
  public void castAs219() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs220() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs221() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs222() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:time.
   */
  @org.junit.Test
  public void castAs223() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:date.
   */
  @org.junit.Test
  public void castAs224() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs225() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:gYear.
   */
  @org.junit.Test
  public void castAs226() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs227() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:gDay.
   */
  @org.junit.Test
  public void castAs228() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs229() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:boolean.
   */
  @org.junit.Test
  public void castAs230() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs231() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs232() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:double(1e5) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs233() {
    final XQuery query = new XQuery(
      "xs:double(\"1e5\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs234() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.1234")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:string.
   */
  @org.junit.Test
  public void castAs235() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.1234")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:float.
   */
  @org.junit.Test
  public void castAs236() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.1234")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:double.
   */
  @org.junit.Test
  public void castAs237() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.1234")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:decimal.
   */
  @org.junit.Test
  public void castAs238() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.1234")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:integer.
   */
  @org.junit.Test
  public void castAs239() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-1")
    );
  }

  /**
   * Try casting xs:decimal(5.5432) to xs:integer.
   */
  @org.junit.Test
  public void castAs240() {
    final XQuery query = new XQuery(
      "xs:decimal(\"5.5432\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("5")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:duration.
   */
  @org.junit.Test
  public void castAs241() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs242() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs243() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs244() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:time.
   */
  @org.junit.Test
  public void castAs245() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:date.
   */
  @org.junit.Test
  public void castAs246() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs247() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:gYear.
   */
  @org.junit.Test
  public void castAs248() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs249() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:gDay.
   */
  @org.junit.Test
  public void castAs250() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs251() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:boolean.
   */
  @org.junit.Test
  public void castAs252() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs253() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs254() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:decimal(-1.1234) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs255() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-1.1234\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(1) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs256() {
    final XQuery query = new XQuery(
      "xs:integer(\"1\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:string.
   */
  @org.junit.Test
  public void castAs257() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-100")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:float.
   */
  @org.junit.Test
  public void castAs258() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-100")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:double.
   */
  @org.junit.Test
  public void castAs259() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-100")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:decimal.
   */
  @org.junit.Test
  public void castAs260() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-100")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:integer.
   */
  @org.junit.Test
  public void castAs261() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-100")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:duration.
   */
  @org.junit.Test
  public void castAs262() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs263() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs264() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs265() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:time.
   */
  @org.junit.Test
  public void castAs266() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:date.
   */
  @org.junit.Test
  public void castAs267() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs268() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:gYear.
   */
  @org.junit.Test
  public void castAs269() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs270() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:gDay.
   */
  @org.junit.Test
  public void castAs271() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs272() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:boolean.
   */
  @org.junit.Test
  public void castAs273() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs274() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs275() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:integer(-100) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs276() {
    final XQuery query = new XQuery(
      "xs:integer(\"-100\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs277() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M3DT10H30M23S")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:string.
   */
  @org.junit.Test
  public void castAs278() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M3DT10H30M23S")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:float.
   */
  @org.junit.Test
  public void castAs279() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:double.
   */
  @org.junit.Test
  public void castAs280() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:decimal.
   */
  @org.junit.Test
  public void castAs281() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:integer.
   */
  @org.junit.Test
  public void castAs282() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:duration.
   */
  @org.junit.Test
  public void castAs283() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M3DT10H30M23S")
    );
  }

  /**
   * Try casting xs:duration(PT10H) to xs:duration.
   */
  @org.junit.Test
  public void castAs284() {
    final XQuery query = new XQuery(
      "xs:duration(\"PT10H\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "PT10H")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs285() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M")
    );
  }

  /**
   * Try casting xs:duration(PT10H) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs286() {
    final XQuery query = new XQuery(
      "xs:duration(\"PT10H\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P0M")
    );
  }

  /**
   * Try casting xs:duration(P24M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs287() {
    final XQuery query = new XQuery(
      "xs:duration(\"P24M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P2Y")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs288() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P3DT10H30M23S")
    );
  }

  /**
   * Try casting xs:duration(PT10H) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs289() {
    final XQuery query = new XQuery(
      "xs:duration(\"PT10H\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "PT10H")
    );
  }

  /**
   * Try casting xs:duration(P24M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs290() {
    final XQuery query = new XQuery(
      "xs:duration(\"P24M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "PT0S")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs291() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:time.
   */
  @org.junit.Test
  public void castAs292() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:date.
   */
  @org.junit.Test
  public void castAs293() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs294() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:gYear.
   */
  @org.junit.Test
  public void castAs295() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs296() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:gDay.
   */
  @org.junit.Test
  public void castAs297() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs298() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:boolean.
   */
  @org.junit.Test
  public void castAs299() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs300() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs301() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:duration(P1Y2M3DT10H30M23S) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs302() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M23S\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs303() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:string.
   */
  @org.junit.Test
  public void castAs304() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:float.
   */
  @org.junit.Test
  public void castAs305() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:double.
   */
  @org.junit.Test
  public void castAs306() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:decimal.
   */
  @org.junit.Test
  public void castAs307() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:integer.
   */
  @org.junit.Test
  public void castAs308() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:duration.
   */
  @org.junit.Test
  public void castAs309() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs310() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1Y2M")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(-P21M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs311() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"-P21M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-P1Y9M")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs312() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "PT0S")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs313() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:time.
   */
  @org.junit.Test
  public void castAs314() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:date.
   */
  @org.junit.Test
  public void castAs315() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs316() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:gYear.
   */
  @org.junit.Test
  public void castAs317() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs318() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:gDay.
   */
  @org.junit.Test
  public void castAs319() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs320() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:boolean.
   */
  @org.junit.Test
  public void castAs321() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs322() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs323() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:yearMonthDuration(P1Y2M) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs324() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y2M\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs325() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P3DT10H30M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(-PT100M) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs326() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"-PT100M\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-PT1H40M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:string.
   */
  @org.junit.Test
  public void castAs327() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P3DT10H30M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(-PT100M) to xs:string.
   */
  @org.junit.Test
  public void castAs328() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"-PT100M\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-PT1H40M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:float.
   */
  @org.junit.Test
  public void castAs329() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:double.
   */
  @org.junit.Test
  public void castAs330() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:decimal.
   */
  @org.junit.Test
  public void castAs331() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:integer.
   */
  @org.junit.Test
  public void castAs332() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:duration.
   */
  @org.junit.Test
  public void castAs333() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P3DT10H30M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(PT24H) to xs:duration.
   */
  @org.junit.Test
  public void castAs334() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"PT24H\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P1D")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(-PT100M) to xs:duration.
   */
  @org.junit.Test
  public void castAs335() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"-PT100M\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-PT1H40M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs336() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P0M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs337() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P3DT10H30M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P14D) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs338() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P14D\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "P14D")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(-PT100M) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs339() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"-PT100M\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-PT1H40M")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs340() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:time.
   */
  @org.junit.Test
  public void castAs341() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:date.
   */
  @org.junit.Test
  public void castAs342() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs343() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:gYear.
   */
  @org.junit.Test
  public void castAs344() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs345() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:gDay.
   */
  @org.junit.Test
  public void castAs346() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs347() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:boolean.
   */
  @org.junit.Test
  public void castAs348() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs349() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs350() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dayTimeDuration(P3DT10H30M) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs351() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H30M\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs352() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T13:20:00")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs353() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1999-05-31T13:20:00+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:string.
   */
  @org.junit.Test
  public void castAs354() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T13:20:00")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:string.
   */
  @org.junit.Test
  public void castAs355() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1999-05-31T13:20:00+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:float.
   */
  @org.junit.Test
  public void castAs356() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(2000-01-16T00:00:00Z) to xs:float.
   */
  @org.junit.Test
  public void castAs357() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2000-01-16T00:00:00Z\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:decimal.
   */
  @org.junit.Test
  public void castAs358() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:integer.
   */
  @org.junit.Test
  public void castAs359() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:duration.
   */
  @org.junit.Test
  public void castAs360() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs361() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs362() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs363() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T13:20:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:time.
   */
  @org.junit.Test
  public void castAs364() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:time.
   */
  @org.junit.Test
  public void castAs365() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:date.
   */
  @org.junit.Test
  public void castAs366() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:date.
   */
  @org.junit.Test
  public void castAs367() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1999-05-31+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs368() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs369() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1999-05+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:gYear.
   */
  @org.junit.Test
  public void castAs370() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:gYear.
   */
  @org.junit.Test
  public void castAs371() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1999+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs372() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs373() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:gDay.
   */
  @org.junit.Test
  public void castAs374() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:gDay.
   */
  @org.junit.Test
  public void castAs375() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs376() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05")
    );
  }

  /**
   * Try casting xs:dateTime(-1999-05-31T13:20:00+14:00) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs377() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"-1999-05-31T13:20:00+14:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05+14:00")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:boolean.
   */
  @org.junit.Test
  public void castAs378() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs379() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs380() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:dateTime(1999-05-31T13:20:00) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs381() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs382() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00-05:00")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:string.
   */
  @org.junit.Test
  public void castAs383() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00-05:00")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:float.
   */
  @org.junit.Test
  public void castAs384() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:double.
   */
  @org.junit.Test
  public void castAs385() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:decimal.
   */
  @org.junit.Test
  public void castAs386() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:integer.
   */
  @org.junit.Test
  public void castAs387() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:duration.
   */
  @org.junit.Test
  public void castAs388() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs389() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs390() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs391() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:time.
   */
  @org.junit.Test
  public void castAs392() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00-05:00")
    );
  }

  /**
   * Try casting xs:time(13:20:02.123) to xs:time.
   */
  @org.junit.Test
  public void castAs393() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:02.123\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:02.123")
    );
  }

  /**
   * Try casting xs:time(13:20:00Z) to xs:time.
   */
  @org.junit.Test
  public void castAs394() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00Z\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00Z")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:date.
   */
  @org.junit.Test
  public void castAs395() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs396() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:gYear.
   */
  @org.junit.Test
  public void castAs397() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs398() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:gDay.
   */
  @org.junit.Test
  public void castAs399() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs400() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:boolean.
   */
  @org.junit.Test
  public void castAs401() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs402() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs403() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:time(13:20:00-05:00) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs404() {
    final XQuery query = new XQuery(
      "xs:time(\"13:20:00-05:00\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs405() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   * Try casting xs:date(-0012-12-03-05:00) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs406() {
    final XQuery query = new XQuery(
      "xs:date(\"-0012-12-03-05:00\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-03-05:00")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:string.
   */
  @org.junit.Test
  public void castAs407() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   * Try casting xs:date(-0012-12-03-05:00) to xs:string.
   */
  @org.junit.Test
  public void castAs408() {
    final XQuery query = new XQuery(
      "xs:date(\"-0012-12-03-05:00\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-03-05:00")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:float.
   */
  @org.junit.Test
  public void castAs409() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:double.
   */
  @org.junit.Test
  public void castAs410() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31Z) to xs:double.
   */
  @org.junit.Test
  public void castAs411() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31Z\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:integer.
   */
  @org.junit.Test
  public void castAs412() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:duration.
   */
  @org.junit.Test
  public void castAs413() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs414() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs415() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs416() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T00:00:00")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:time.
   */
  @org.junit.Test
  public void castAs417() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:date.
   */
  @org.junit.Test
  public void castAs418() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   * Try casting xs:date(-0012-12-03-05:00) to xs:date.
   */
  @org.junit.Test
  public void castAs419() {
    final XQuery query = new XQuery(
      "xs:date(\"-0012-12-03-05:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-03-05:00")
    );
  }

  /**
   * Try casting xs:date(1999-05-31Z) to xs:date.
   */
  @org.junit.Test
  public void castAs420() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31Z\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31Z")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs421() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:gYear.
   */
  @org.junit.Test
  public void castAs422() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999")
    );
  }

  /**
   * Try casting xs:date(-0012-12-03-05:00) to xs:gYear.
   */
  @org.junit.Test
  public void castAs423() {
    final XQuery query = new XQuery(
      "xs:date(\"-0012-12-03-05:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-05:00")
    );
  }

  /**
   * Try casting xs:date(1999-05-31Z) to xs:gYear.
   */
  @org.junit.Test
  public void castAs424() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31Z\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999Z")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs425() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31")
    );
  }

  /**
   * Try casting xs:date(-0012-12-03-05:00) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs426() {
    final XQuery query = new XQuery(
      "xs:date(\"-0012-12-03-05:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--12-03-05:00")
    );
  }

  /**
   * Try casting xs:date(1999-05-31Z) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs427() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31Z\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31Z")
    );
  }

  /**
   * Try casting xs:date(1999-05-31Z) to xs:gDay.
   */
  @org.junit.Test
  public void castAs428() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31Z\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31Z")
    );
  }

  /**
   * Try casting xs:date(-0012-12-03-05:00) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs429() {
    final XQuery query = new XQuery(
      "xs:date(\"-0012-12-03-05:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--12-05:00")
    );
  }

  /**
   * Try casting xs:date(1999-05-31Z) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs430() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31Z\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05Z")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:boolean.
   */
  @org.junit.Test
  public void castAs431() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs432() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs433() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:date(1999-05-31) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs434() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs435() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05) to xs:string.
   */
  @org.junit.Test
  public void castAs436() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05) to xs:float.
   */
  @org.junit.Test
  public void castAs437() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05) to xs:double.
   */
  @org.junit.Test
  public void castAs438() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:double.
   */
  @org.junit.Test
  public void castAs439() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:decimal.
   */
  @org.junit.Test
  public void castAs440() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:integer.
   */
  @org.junit.Test
  public void castAs441() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:duration.
   */
  @org.junit.Test
  public void castAs442() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs443() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs444() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs445() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:time.
   */
  @org.junit.Test
  public void castAs446() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:date.
   */
  @org.junit.Test
  public void castAs447() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs448() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05")
    );
  }

  /**
   * Try casting xs:gYearMonth(-0012-12-05:00) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs449() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"-0012-12-05:00\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-12-05:00")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs450() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05Z")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:gYear.
   */
  @org.junit.Test
  public void castAs451() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs452() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:gDay.
   */
  @org.junit.Test
  public void castAs453() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs454() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:boolean.
   */
  @org.junit.Test
  public void castAs455() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs456() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs457() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYearMonth(1999-05Z) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs458() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-05Z\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs459() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:string.
   */
  @org.junit.Test
  public void castAs460() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:float.
   */
  @org.junit.Test
  public void castAs461() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:double.
   */
  @org.junit.Test
  public void castAs462() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:decimal.
   */
  @org.junit.Test
  public void castAs463() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:integer.
   */
  @org.junit.Test
  public void castAs464() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:duration.
   */
  @org.junit.Test
  public void castAs465() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs466() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs467() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:time.
   */
  @org.junit.Test
  public void castAs468() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:date.
   */
  @org.junit.Test
  public void castAs469() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs470() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:gYear.
   */
  @org.junit.Test
  public void castAs471() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999")
    );
  }

  /**
   * Try casting xs:gYear(-0012-05:00) to xs:gYear.
   */
  @org.junit.Test
  public void castAs472() {
    final XQuery query = new XQuery(
      "xs:gYear(\"-0012-05:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-0012-05:00")
    );
  }

  /**
   * Try casting xs:gYear(1999Z) to xs:gYear.
   */
  @org.junit.Test
  public void castAs473() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999Z\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999Z")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs474() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:gDay.
   */
  @org.junit.Test
  public void castAs475() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs476() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:boolean.
   */
  @org.junit.Test
  public void castAs477() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs478() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs479() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gYear(1999) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs480() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs481() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:string.
   */
  @org.junit.Test
  public void castAs482() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:float.
   */
  @org.junit.Test
  public void castAs483() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:double.
   */
  @org.junit.Test
  public void castAs484() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:decimal.
   */
  @org.junit.Test
  public void castAs485() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:integer.
   */
  @org.junit.Test
  public void castAs486() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:duration.
   */
  @org.junit.Test
  public void castAs487() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs488() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs489() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs490() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:time.
   */
  @org.junit.Test
  public void castAs491() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:date.
   */
  @org.junit.Test
  public void castAs492() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs493() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:gYear.
   */
  @org.junit.Test
  public void castAs494() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs495() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31")
    );
  }

  /**
   * Try casting xs:gMonthDay(--12-03-05:00) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs496() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--12-03-05:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--12-03-05:00")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31Z) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs497() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31Z\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05-31Z")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:gDay.
   */
  @org.junit.Test
  public void castAs498() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs499() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:boolean.
   */
  @org.junit.Test
  public void castAs500() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs501() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs502() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonthDay(--05-31) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs503() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--05-31\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs504() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:string.
   */
  @org.junit.Test
  public void castAs505() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:float.
   */
  @org.junit.Test
  public void castAs506() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:double.
   */
  @org.junit.Test
  public void castAs507() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:decimal.
   */
  @org.junit.Test
  public void castAs508() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:integer.
   */
  @org.junit.Test
  public void castAs509() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:duration.
   */
  @org.junit.Test
  public void castAs510() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs511() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs512() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs513() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:time.
   */
  @org.junit.Test
  public void castAs514() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:date.
   */
  @org.junit.Test
  public void castAs515() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs516() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:gYear.
   */
  @org.junit.Test
  public void castAs517() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs518() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:gDay.
   */
  @org.junit.Test
  public void castAs519() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31")
    );
  }

  /**
   * Try casting xs:gDay(---03-05:00) to xs:gDay.
   */
  @org.junit.Test
  public void castAs520() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03-05:00\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---03-05:00")
    );
  }

  /**
   * Try casting xs:gDay(---31Z) to xs:gDay.
   */
  @org.junit.Test
  public void castAs521() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31Z\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "---31Z")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs522() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:boolean.
   */
  @org.junit.Test
  public void castAs523() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs524() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs525() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gDay(---31) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs526() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---31\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs527() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:string.
   */
  @org.junit.Test
  public void castAs528() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:float.
   */
  @org.junit.Test
  public void castAs529() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:double.
   */
  @org.junit.Test
  public void castAs530() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:decimal.
   */
  @org.junit.Test
  public void castAs531() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:integer.
   */
  @org.junit.Test
  public void castAs532() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:duration.
   */
  @org.junit.Test
  public void castAs533() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs534() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs535() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs536() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:time.
   */
  @org.junit.Test
  public void castAs537() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:date.
   */
  @org.junit.Test
  public void castAs538() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs539() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:gYear.
   */
  @org.junit.Test
  public void castAs540() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs541() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:gDay.
   */
  @org.junit.Test
  public void castAs542() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs543() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05")
    );
  }

  /**
   * Try casting xs:gMonth(--12-05:00) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs544() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--12-05:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--12-05:00")
    );
  }

  /**
   * Try casting xs:gMonth(--05Z) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs545() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05Z\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "--05Z")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:boolean.
   */
  @org.junit.Test
  public void castAs546() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs547() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs548() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:gMonth(--05) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs549() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--05\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs550() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:string.
   */
  @org.junit.Test
  public void castAs551() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:float.
   */
  @org.junit.Test
  public void castAs552() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   * Try casting xs:boolean(false) to xs:float.
   */
  @org.junit.Test
  public void castAs553() {
    final XQuery query = new XQuery(
      "xs:boolean(\"false\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:double.
   */
  @org.junit.Test
  public void castAs554() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   * Try casting xs:boolean(false) to xs:double.
   */
  @org.junit.Test
  public void castAs555() {
    final XQuery query = new XQuery(
      "xs:boolean(\"false\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:decimal.
   */
  @org.junit.Test
  public void castAs556() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   * Try casting xs:boolean(false) to xs:decimal.
   */
  @org.junit.Test
  public void castAs557() {
    final XQuery query = new XQuery(
      "xs:boolean(\"false\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:integer.
   */
  @org.junit.Test
  public void castAs558() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   * Try casting xs:boolean(false) to xs:integer.
   */
  @org.junit.Test
  public void castAs559() {
    final XQuery query = new XQuery(
      "xs:boolean(\"false\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:duration.
   */
  @org.junit.Test
  public void castAs560() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs561() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs562() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs563() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:time.
   */
  @org.junit.Test
  public void castAs564() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:date.
   */
  @org.junit.Test
  public void castAs565() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs566() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:gYear.
   */
  @org.junit.Test
  public void castAs567() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs568() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:gDay.
   */
  @org.junit.Test
  public void castAs569() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs570() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:boolean.
   */
  @org.junit.Test
  public void castAs571() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * Try casting xs:boolean(false) to xs:boolean.
   */
  @org.junit.Test
  public void castAs572() {
    final XQuery query = new XQuery(
      "xs:boolean(\"false\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs573() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs574() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:boolean(true) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs575() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(01001010) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs576() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"01001010\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "01001010")
    );
  }

  /**
   * Try casting xs:base64Binary(0FB7) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs577() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"0FB7\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0FB7")
    );
  }

  /**
   * Try casting xs:base64Binary(01001010) to xs:string.
   */
  @org.junit.Test
  public void castAs578() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"01001010\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "01001010")
    );
  }

  /**
   * Try casting xs:base64Binary(0FB7) to xs:string.
   */
  @org.junit.Test
  public void castAs579() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"0FB7\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0FB7")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:float.
   */
  @org.junit.Test
  public void castAs580() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:double.
   */
  @org.junit.Test
  public void castAs581() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:decimal.
   */
  @org.junit.Test
  public void castAs582() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:integer.
   */
  @org.junit.Test
  public void castAs583() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:duration.
   */
  @org.junit.Test
  public void castAs584() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs585() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs586() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs587() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:time.
   */
  @org.junit.Test
  public void castAs588() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:date.
   */
  @org.junit.Test
  public void castAs589() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs590() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:gYear.
   */
  @org.junit.Test
  public void castAs591() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs592() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:gDay.
   */
  @org.junit.Test
  public void castAs593() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs594() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:boolean.
   */
  @org.junit.Test
  public void castAs595() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:base64Binary(01001010) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs596() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"01001010\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "01001010")
    );
  }

  /**
   * Try casting xs:base64Binary(0FB7) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs597() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"0FB7\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0FB7")
    );
  }

  /**
   * Try casting xs:base64Binary(00000000) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs598() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"00000000\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D34D34D34D34")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs599() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:base64Binary(aA+zZ/09) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs600() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aA+zZ/09\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "680FB367FD3D")
    );
  }

  /**
   * Try casting xs:base64Binary(0FB7) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs601() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"0FB7\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D0507B")
    );
  }

  /**
   * Try casting xs:base64Binary(10010101) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs602() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"10010101\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs603() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:string.
   */
  @org.junit.Test
  public void castAs604() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:float.
   */
  @org.junit.Test
  public void castAs605() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:double.
   */
  @org.junit.Test
  public void castAs606() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:decimal.
   */
  @org.junit.Test
  public void castAs607() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:integer.
   */
  @org.junit.Test
  public void castAs608() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:duration.
   */
  @org.junit.Test
  public void castAs609() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs610() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs611() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs612() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:time.
   */
  @org.junit.Test
  public void castAs613() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:date.
   */
  @org.junit.Test
  public void castAs614() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs615() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:gYear.
   */
  @org.junit.Test
  public void castAs616() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs617() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:gDay.
   */
  @org.junit.Test
  public void castAs618() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs619() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:boolean.
   */
  @org.junit.Test
  public void castAs620() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs621() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "10010101")
    );
  }

  /**
   * Try casting xs:hexBinary(0fb7) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs622() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0fb7\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D7c=")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs623() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:hexBinary(d74d35d35d35) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs624() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"d74d35d35d35\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "D74D35D35D35")
    );
  }

  /**
   * Try casting xs:hexBinary(D74D35D35D35) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs625() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"D74D35D35D35\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:untypedAtomic.
   */
  @org.junit.Test
  public void castAs626() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://www.ietf.org/rfc/rfc2396.txt")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:string.
   */
  @org.junit.Test
  public void castAs627() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://www.ietf.org/rfc/rfc2396.txt")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:float.
   */
  @org.junit.Test
  public void castAs628() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:double.
   */
  @org.junit.Test
  public void castAs629() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:decimal.
   */
  @org.junit.Test
  public void castAs630() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:integer.
   */
  @org.junit.Test
  public void castAs631() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:duration.
   */
  @org.junit.Test
  public void castAs632() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:yearMonthDuration.
   */
  @org.junit.Test
  public void castAs633() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:dayTimeDuration.
   */
  @org.junit.Test
  public void castAs634() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:dateTime.
   */
  @org.junit.Test
  public void castAs635() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:time.
   */
  @org.junit.Test
  public void castAs636() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:date.
   */
  @org.junit.Test
  public void castAs637() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:gYearMonth.
   */
  @org.junit.Test
  public void castAs638() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:gYear.
   */
  @org.junit.Test
  public void castAs639() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:gMonthDay.
   */
  @org.junit.Test
  public void castAs640() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:gDay.
   */
  @org.junit.Test
  public void castAs641() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:gMonth.
   */
  @org.junit.Test
  public void castAs642() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:boolean.
   */
  @org.junit.Test
  public void castAs643() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:base64Binary.
   */
  @org.junit.Test
  public void castAs644() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:hexBinary.
   */
  @org.junit.Test
  public void castAs645() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * Try casting xs:anyURI(http://www.ietf.org/rfc/rfc2396.txt) to xs:anyURI.
   */
  @org.junit.Test
  public void castAs646() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.ietf.org/rfc/rfc2396.txt\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://www.ietf.org/rfc/rfc2396.txt")
    );
  }

  /**
   *  Evaluates casting a string into a decimal.may process casting or raise error. This test may have differentoutcomes..
   */
  @org.junit.Test
  public void castAs647() {
    final XQuery query = new XQuery(
      "xs:string(2.123456789123456789) cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertStringValue(false, "2.123456789123456789")
      ||
        error("FOCA0006")
      )
    );
  }

  /**
   *  Evaluates casting a string into a nonPositiveInteger..
   */
  @org.junit.Test
  public void castAs648() {
    final XQuery query = new XQuery(
      "xs:string(-20) cast as xs:nonPositiveInteger",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-20")
    );
  }

  /**
   *  Evaluates casting a string into an xs:long..
   */
  @org.junit.Test
  public void castAs649() {
    final XQuery query = new XQuery(
      "xs:string(20) cast as xs:long",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("20")
    );
  }

  /**
   *  Evaluates casting a string into an xs:nonNegativeInteger.
   */
  @org.junit.Test
  public void castAs650() {
    final XQuery query = new XQuery(
      "xs:string(200) cast as xs:nonNegativeInteger",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("200")
    );
  }

  /**
   *  Evaluates casting a string into an xs:negativeInteger.
   */
  @org.junit.Test
  public void castAs651() {
    final XQuery query = new XQuery(
      "xs:string(-201) cast as xs:negativeInteger",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-201")
    );
  }

  /**
   *  Evaluates casting a string into an xs:int.
   */
  @org.junit.Test
  public void castAs652() {
    final XQuery query = new XQuery(
      "xs:string(20) cast as xs:int",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("20")
    );
  }

  /**
   *  Evaluates casting a string into an xs:unsignedLong.
   */
  @org.junit.Test
  public void castAs653() {
    final XQuery query = new XQuery(
      "xs:string(20) cast as xs:unsignedLong",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("20")
    );
  }

  /**
   *  Evaluates casting a string into an xs:positiveInteger.
   */
  @org.junit.Test
  public void castAs654() {
    final XQuery query = new XQuery(
      "xs:string(300) cast as xs:positiveInteger",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("300")
    );
  }

  /**
   *  Evaluates casting a string into an xs:short.
   */
  @org.junit.Test
  public void castAs655() {
    final XQuery query = new XQuery(
      "xs:string(30) cast as xs:short",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("30")
    );
  }

  /**
   *  Evaluates casting a string into an xs:unsignedInt.
   */
  @org.junit.Test
  public void castAs656() {
    final XQuery query = new XQuery(
      "xs:string(300) cast as xs:unsignedInt",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("300")
    );
  }

  /**
   *  Evaluates casting a string into an xs:byte.
   */
  @org.junit.Test
  public void castAs657() {
    final XQuery query = new XQuery(
      "xs:string(120) cast as xs:byte",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("120")
    );
  }

  /**
   *  Evaluates casting a string into an xs:unsignedShort.
   */
  @org.junit.Test
  public void castAs658() {
    final XQuery query = new XQuery(
      "xs:string(12) cast as xs:unsignedShort",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("12")
    );
  }

  /**
   *  Evaluates casting a string into an xs:unsignedByte.
   */
  @org.junit.Test
  public void castAs659() {
    final XQuery query = new XQuery(
      "xs:string(12) cast as xs:unsignedByte",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("12")
    );
  }

  /**
   *  Evaluates casting a long into an xs:short.
   */
  @org.junit.Test
  public void castAs660() {
    final XQuery query = new XQuery(
      "let $var := xs:long(120) cast as xs:short return $var instance of xs:short",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a short into an xs:long.
   */
  @org.junit.Test
  public void castAs661() {
    final XQuery query = new XQuery(
      "let $var := xs:short(120) cast as xs:long return $var instance of xs:long",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:nonPositiveInteger into an xs:negativeInteger.
   */
  @org.junit.Test
  public void castAs662() {
    final XQuery query = new XQuery(
      "let $var := xs:nonPositiveInteger(-120) cast as xs:negativeInteger return $var instance of xs:negativeInteger",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:nonNegativeInteger into an xs:positiveInteger.
   */
  @org.junit.Test
  public void castAs663() {
    final XQuery query = new XQuery(
      "let $var := xs:nonNegativeInteger(120) cast as xs:positiveInteger return $var instance of xs:positiveInteger",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:short into an xs:unsignedShort.
   */
  @org.junit.Test
  public void castAs664() {
    final XQuery query = new XQuery(
      "let $var := xs:short(120) cast as xs:unsignedShort return $var instance of xs:unsignedShort",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:int into an xs:long.
   */
  @org.junit.Test
  public void castAs665() {
    final XQuery query = new XQuery(
      "let $var := xs:int(120) cast as xs:long return $var instance of xs:long",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:long into an xs:int.
   */
  @org.junit.Test
  public void castAs666() {
    final XQuery query = new XQuery(
      "let $var := xs:long(120) cast as xs:int return $var instance of xs:int",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:unsignedShort into an xs:unsignedInt.
   */
  @org.junit.Test
  public void castAs667() {
    final XQuery query = new XQuery(
      "let $var := xs:unsignedShort(120) cast as xs:unsignedInt return $var instance of xs:unsignedInt",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:unsignedInt into an xs:unsignedShort.
   */
  @org.junit.Test
  public void castAs668() {
    final XQuery query = new XQuery(
      "let $var := xs:unsignedInt(120) cast as xs:unsignedShort return $var instance of xs:unsignedShort",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a xs:byte into an xs:unsignedByte.
   */
  @org.junit.Test
  public void castAs669() {
    final XQuery query = new XQuery(
      "let $var := xs:byte(120) cast as xs:unsignedByte return $var instance of xs:unsignedByte",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates overflow of an xs:date time (error FODT0001)It adds 9,000 years to a date created in 2006..
   */
  @org.junit.Test
  public void castAs670() {
    final XQuery query = new XQuery(
      "let $d1 := '2006-07-12' cast as xs:date let $oneky := xs:yearMonthDuration('P1000Y') let $d2 := $d1 + $oneky let $d3 := $d2 + $oneky let $d4 := $d3 + $oneky let $d5 := $d4 + $oneky let $d6 := $d5 + $oneky let $d7 := $d6 + $oneky let $d8 := $d7 + $oneky let $d9 := $d8 + $oneky let $d10 := $d9 + $oneky return $d10",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertStringValue(false, "11006-07-12")
      ||
        error("FODT0001")
      )
    );
  }

  /**
   *  Evaluates casting a string as an xs:ENTITY.
   */
  @org.junit.Test
  public void castAs671() {
    final XQuery query = new XQuery(
      "let $var := \"abc\" cast as xs:ENTITY return $var instance of xs:ENTITY",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluates casting a sequence of strings as an xs:ENTITY.
   */
  @org.junit.Test
  public void castAs672() {
    final XQuery query = new XQuery(
      "let $var := (\"a\",\"b\",\"c\") cast as xs:ENTITY return count($var) lt 10",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  Try to cast a variable to xs:QName.
   */
  @org.junit.Test
  public void castAs673() {
    final XQuery query = new XQuery(
      "let $var := \"ABC\" return $var cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertStringValue(false, "ABC")
      ||
        error("XPTY0004")
      )
    );
  }

  /**
   *  Try to cast an element to xs:QName.
   *         Fails in 1.0 because only a string literal can be cast to xs:QName
   *         Fails in 3.0 because atomization of the argument is not allowed - see bug 11964.
   */
  @org.junit.Test
  public void castAs674a() {
    final XQuery query = new XQuery(
      "let $var := <e>xml:space</e> return $var cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0117")
    );
  }

  /**
   *  Try to do an implicit cast from untypedAtomic to xs:QName as part of a function call
   *         Fails in 1.0 because only a string literal can be cast to xs:QName
   *         Fails in 3.0 because implicit cast to xs:QName during a function call is not allowed - see bug 11964.
   */
  @org.junit.Test
  public void castAs675() {
    final XQuery query = new XQuery(
      "\n" +
      "        declare function local:clarkname($q as xs:QName) as xs:string { \n" +
      "          concat('{', namespace-uri-from-QName($q), '}', local-name-from-QName($q)) \n" +
      "        }; \n" +
      "        let $var := <e>xml:space</e> \n" +
      "        return (local:clarkname(node-name($var)), local:clarkname(xs:untypedAtomic($var)))\n" +
      "      ",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  casting an xs:decimal with a value to big for that type..
   */
  @org.junit.Test
  public void castFOCA00011() {
    final XQuery query = new XQuery(
      "xs:decimal(99e100)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertEq("989999999999999971062477677470550235220096190889648004812994130017827049653182301025734968880029237248")
      ||
        assertEq("990000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
      ||
        assertEq("989999999999999970000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
      ||
        error("FOCA0001")
      )
    );
  }

  /**
   *  casting an xs:integer with a value to big for that type..
   */
  @org.junit.Test
  public void castFOCA00031() {
    final XQuery query = new XQuery(
      "xs:integer(99e100)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertEq("989999999999999971062477677470550235220096190889648004812994130017827049653182301025734968880029237248")
      ||
        assertEq("990000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
      ||
        assertEq("989999999999999970000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
      ||
        error("FOCA0003")
      )
    );
  }

  /**
   *  Syntax: only ? is allowed as occurence indicator in 'cast as' expressions..
   */
  @org.junit.Test
  public void kSeqExprCast1() {
    final XQuery query = new XQuery(
      "'string' cast as xs:string*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0003")
    );
  }

  /**
   *  A non-atomic type is referenced, leading to a syntax error..
   */
  @org.junit.Test
  public void kSeqExprCast10() {
    final XQuery query = new XQuery(
      "'string' cast as item()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0003")
      ||
        error("XPST0051")
      )
    );
  }

  /**
   *  A test whose essence is: `exists(xs:hexBinary("aa"))`..
   */
  @org.junit.Test
  public void kSeqExprCast100() {
    final XQuery query = new XQuery(
      "exists(xs:hexBinary(\"aa\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1000() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:gYear constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1001() {
    final XQuery query = new XQuery(
      "xs:gYear()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:gYear constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1002() {
    final XQuery query = new XQuery(
      "xs:gYear( \"1999\" , \"1999\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:gYear constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1003() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:gYear(\"1999\")), 3, 1) instance of xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:gYear..
   */
  @org.junit.Test
  public void kSeqExprCast1004() {
    final XQuery query = new XQuery(
      "xs:gYear(\" 1999 \") eq xs:gYear(\" 1999 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:gYear..
   */
  @org.junit.Test
  public void kSeqExprCast1005() {
    final XQuery query = new XQuery(
      "xs:gYear(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "1999" ..
   */
  @org.junit.Test
  public void kSeqExprCast1006() {
    final XQuery query = new XQuery(
      "xs:gYear(xs:untypedAtomic( \"1999\" )) eq xs:gYear(\"1999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:gYear, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast1007() {
    final XQuery query = new XQuery(
      "boolean(xs:gYear(\"1999\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:gYear to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1008() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1009() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `count(xs:hexBinary(xs:hexBinary("03"))) eq 1`..
   */
  @org.junit.Test
  public void kSeqExprCast101() {
    final XQuery query = new XQuery(
      "count(xs:hexBinary(xs:hexBinary(\"03\"))) eq 1",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1010() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1011() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1012() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1013() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1014() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1015() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1016() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1017() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1018() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1019() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("aa")) eq "AA"`..
   */
  @org.junit.Test
  public void kSeqExprCast102() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"aa\")) eq \"AA\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1020() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1021() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1022() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1023() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1024() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1025() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1026() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1027() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1028() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1029() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("0a")) eq "0A"`..
   */
  @org.junit.Test
  public void kSeqExprCast103() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"0a\")) eq \"0A\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1030() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1031() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1032() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1033() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:gYear is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1034() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gYear eq xs:gYear(\"1999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:gYear as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1035() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") castable as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1036() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1037() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1038() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1039() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("a0")) eq "A0"`..
   */
  @org.junit.Test
  public void kSeqExprCast104() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"a0\")) eq \"A0\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1040() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1041() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1042() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1043() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1044() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1045() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1046() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1047() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1048() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1049() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("a4")) eq "A4"`..
   */
  @org.junit.Test
  public void kSeqExprCast105() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"a4\")) eq \"A4\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYear to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1050() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1999\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYear as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1051() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYear as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1052() {
    final XQuery query = new XQuery(
      "not(xs:gYear(\"1999\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:gMonthDay constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1053() {
    final XQuery query = new XQuery(
      "xs:gMonthDay()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:gMonthDay constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1054() {
    final XQuery query = new XQuery(
      "xs:gMonthDay( \"--11-13\" , \"--11-13\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:gMonthDay constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1055() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:gMonthDay(\"--11-13\")), 3, 1) instance of xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast1056() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\" --11-13 \") eq xs:gMonthDay(\" --11-13 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast1057() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "--11-13" ..
   */
  @org.junit.Test
  public void kSeqExprCast1058() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(xs:untypedAtomic( \"--11-13\" )) eq xs:gMonthDay(\"--11-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:gMonthDay, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast1059() {
    final XQuery query = new XQuery(
      "boolean(xs:gMonthDay(\"--11-13\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("c0")) eq "C0"`..
   */
  @org.junit.Test
  public void kSeqExprCast106() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"c0\")) eq \"C0\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1060() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1061() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1062() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1063() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1064() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1065() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1066() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1067() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1068() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1069() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("fA")) eq "FA"`..
   */
  @org.junit.Test
  public void kSeqExprCast107() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"fA\")) eq \"FA\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1070() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1071() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1072() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1073() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1074() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1075() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1076() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1077() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1078() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1079() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("10")) eq "10"`..
   */
  @org.junit.Test
  public void kSeqExprCast108() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"10\")) eq \"10\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1080() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1081() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1082() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1083() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1084() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1085() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1086() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1087() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:gMonthDay is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1088() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:gMonthDay eq xs:gMonthDay(\"--11-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:gMonthDay as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1089() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") castable as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("031a34123b")) eq "031A34123B"`..
   */
  @org.junit.Test
  public void kSeqExprCast109() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"031a34123b\")) eq \"031A34123B\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1090() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1091() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1092() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1093() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1094() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1095() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1096() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1097() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1098() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1099() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A non-atomic type is referenced, leading to a syntax error..
   */
  @org.junit.Test
  public void kSeqExprCast11() {
    final XQuery query = new XQuery(
      "'string' cast as node()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0003")
      ||
        error("XPST0051")
      )
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("03")) eq "03"`..
   */
  @org.junit.Test
  public void kSeqExprCast110() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"03\")) eq \"03\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1100() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1101() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonthDay to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1102() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-13\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1103() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonthDay as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1104() {
    final XQuery query = new XQuery(
      "not(xs:gMonthDay(\"--11-13\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:gDay constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1105() {
    final XQuery query = new XQuery(
      "xs:gDay()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:gDay constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1106() {
    final XQuery query = new XQuery(
      "xs:gDay( \"---03\" , \"---03\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:gDay constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1107() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:gDay(\"---03\")), 3, 1) instance of xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast1108() {
    final XQuery query = new XQuery(
      "xs:gDay(\" ---03 \") eq xs:gDay(\" ---03 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast1109() {
    final XQuery query = new XQuery(
      "xs:gDay(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("0c")) eq "0C"`..
   */
  @org.junit.Test
  public void kSeqExprCast111() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"0c\")) eq \"0C\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "---03" ..
   */
  @org.junit.Test
  public void kSeqExprCast1110() {
    final XQuery query = new XQuery(
      "xs:gDay(xs:untypedAtomic( \"---03\" )) eq xs:gDay(\"---03\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:gDay, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast1111() {
    final XQuery query = new XQuery(
      "boolean(xs:gDay(\"---03\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:gDay to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1112() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1113() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1114() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1115() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1116() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1117() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1118() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1119() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("0b")) eq "0B"`..
   */
  @org.junit.Test
  public void kSeqExprCast112() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"0b\")) eq \"0B\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1120() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1121() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1122() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1123() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1124() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1125() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1126() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1127() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1128() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1129() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary("3a")) eq "3A"`..
   */
  @org.junit.Test
  public void kSeqExprCast113() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"3a\")) eq \"3A\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1130() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1131() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1132() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1133() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1134() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1135() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1136() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1137() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1138() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1139() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is a valid lexical representation for xs:hexBinary, and means 'no data..
   */
  @org.junit.Test
  public void kSeqExprCast114() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(\"\")) eq \"\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1140() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1141() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:gDay is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1142() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:gDay eq xs:gDay(\"---03\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:gDay as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1143() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") castable as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1144() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1145() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1146() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1147() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1148() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1149() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast115() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"=aaabbcd\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:gDay to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1150() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1151() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1152() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1153() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gDay to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1154() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---03\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gDay as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1155() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gDay as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1156() {
    final XQuery query = new XQuery(
      "not(xs:gDay(\"---03\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:gMonth constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1157() {
    final XQuery query = new XQuery(
      "xs:gMonth()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:gMonth constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1158() {
    final XQuery query = new XQuery(
      "xs:gMonth( \"--11\" , \"--11\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:gMonth constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1159() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:gMonth(\"--11\")), 3, 1) instance of xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast116() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"F===\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast1160() {
    final XQuery query = new XQuery(
      "xs:gMonth(\" --11 \") eq xs:gMonth(\" --11 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast1161() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "--11" ..
   */
  @org.junit.Test
  public void kSeqExprCast1162() {
    final XQuery query = new XQuery(
      "xs:gMonth(xs:untypedAtomic( \"--11\" )) eq xs:gMonth(\"--11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:gMonth, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast1163() {
    final XQuery query = new XQuery(
      "boolean(xs:gMonth(\"--11\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:gMonth to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1164() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1165() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1166() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1167() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1168() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1169() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast117() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"a\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:gMonth to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1170() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1171() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1172() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1173() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1174() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1175() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1176() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1177() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1178() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1179() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast118() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aaaa====\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:gMonth to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1180() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1181() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1182() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1183() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1184() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1185() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1186() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1187() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1188() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1189() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast119() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aaaa=bcd\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:gMonth to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1190() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1191() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1192() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1193() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1194() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1195() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:gMonth is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1196() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:gMonth eq xs:gMonth(\"--11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:gMonth as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1197() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") castable as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1198() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1199() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A non-atomic type is referenced, leading to a syntax error..
   */
  @org.junit.Test
  public void kSeqExprCast12() {
    final XQuery query = new XQuery(
      "'string' cast as attribute()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0003")
      ||
        error("XPST0051")
      )
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast120() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aaaaa=======\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:gMonth to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1200() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1201() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1202() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1203() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1204() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1205() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gMonth to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1206() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gMonth as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1207() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gMonth as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1208() {
    final XQuery query = new XQuery(
      "not(xs:gMonth(\"--11\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:boolean constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1209() {
    final XQuery query = new XQuery(
      "xs:boolean()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast121() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aaaabcd\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The xs:boolean constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1210() {
    final XQuery query = new XQuery(
      "xs:boolean( \"true\" , \"true\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:boolean constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1211() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:boolean(\"true\")), 3, 1) instance of xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:boolean..
   */
  @org.junit.Test
  public void kSeqExprCast1212() {
    final XQuery query = new XQuery(
      "xs:boolean(\" true \") eq xs:boolean(\" true \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:boolean..
   */
  @org.junit.Test
  public void kSeqExprCast1213() {
    final XQuery query = new XQuery(
      "xs:boolean(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "true" ..
   */
  @org.junit.Test
  public void kSeqExprCast1214() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:untypedAtomic( \"true\" )) eq xs:boolean(\"true\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:boolean that has the lexical value ' "true" ' 
   *       should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast1215() {
    final XQuery query = new XQuery(
      "boolean(xs:boolean(\"true\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1216() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1217() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1218() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1219() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast122() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aaaabcd|\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:boolean to xs:float is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1220() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:float ne xs:float(\"3.4e5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:float as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1221() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") castable as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:double is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1222() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:double ne xs:double(\"3.3e3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:double as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1223() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") castable as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:decimal is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1224() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:decimal ne xs:decimal(\"10.01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:decimal as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1225() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") castable as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:integer is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1226() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:integer ne xs:integer(\"6789\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:integer as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1227() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") castable as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1228() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1229() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast123() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aabb=d==\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:boolean to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1230() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1231() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1232() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1233() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1234() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1235() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1236() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1237() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1238() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1239() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast124() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aabbcd=a\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:boolean to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1240() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1241() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1242() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1243() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1244() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1245() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1246() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1247() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1248() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1249() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An invalid lexical representation for xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast125() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"abcdefghi\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:boolean to xs:boolean is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1250() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:boolean eq xs:boolean(\"true\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:boolean as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1251() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") castable as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1252() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1253() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1254() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1255() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1256() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1257() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:boolean to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1258() {
    final XQuery query = new XQuery(
      "xs:boolean(\"true\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:boolean as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1259() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary("0w==")) eq "0w=="`..
   */
  @org.junit.Test
  public void kSeqExprCast126() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"0w==\")) eq \"0w==\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:boolean as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1260() {
    final XQuery query = new XQuery(
      "not(xs:boolean(\"true\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:base64Binary constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1261() {
    final XQuery query = new XQuery(
      "xs:base64Binary()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:base64Binary constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1262() {
    final XQuery query = new XQuery(
      "xs:base64Binary( \"aaaa\" , \"aaaa\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:base64Binary constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1263() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:base64Binary(\"aaaa\")), 3, 1) instance of xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast1264() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\" aaaa \") eq xs:base64Binary(\" aaaa \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is a valid lexical representation of xs:base64Binary..
   */
  @org.junit.Test
  public void kSeqExprCast1265() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"\") eq xs:base64Binary(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "aaaa" ..
   */
  @org.junit.Test
  public void kSeqExprCast1266() {
    final XQuery query = new XQuery(
      "xs:base64Binary(xs:untypedAtomic( \"aaaa\" )) eq xs:base64Binary(\"aaaa\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:base64Binary, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast1267() {
    final XQuery query = new XQuery(
      "boolean(xs:base64Binary(\"aaaa\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1268() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1269() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary("aaa a")) eq "aaaa"`..
   */
  @org.junit.Test
  public void kSeqExprCast127() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"aaa a\")) eq \"aaaa\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1270() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1271() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1272() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1273() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1274() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1275() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1276() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1277() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1278() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1279() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary("frfhforlksid7453")) eq "frfhforlksid7453"`..
   */
  @org.junit.Test
  public void kSeqExprCast128() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"frfhforlksid7453\")) eq \"frfhforlksid7453\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1280() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1281() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1282() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1283() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1284() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1285() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1286() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1287() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1288() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1289() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  If the last tetragram ends in '==' then the previous character must be one of [AQgw]..
   */
  @org.junit.Test
  public void kSeqExprCast129() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"frfhforlksid745323==\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1290() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1291() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1292() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1293() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1294() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1295() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1296() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1297() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1298() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1299() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A non-atomic type is referenced, leading to a syntax error..
   */
  @org.junit.Test
  public void kSeqExprCast13() {
    final XQuery query = new XQuery(
      "'string' cast as empty-sequence()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0003")
      ||
        error("XPST0051")
      )
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("03"))) eq "Aw=="`..
   */
  @org.junit.Test
  public void kSeqExprCast130() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"03\"))) eq \"Aw==\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1300() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1301() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1302() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1303() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:base64Binary is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1304() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:base64Binary eq xs:base64Binary(\"aaaa\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:base64Binary as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1305() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") castable as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:hexBinary is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1306() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:hexBinary ne xs:hexBinary(\"0FB7\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:hexBinary as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1307() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") castable as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1308() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1309() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("0f3c"))) eq "Dzw="`..
   */
  @org.junit.Test
  public void kSeqExprCast131() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"0f3c\"))) eq \"Dzw=\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:base64Binary to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1310() {
    final XQuery query = new XQuery(
      "xs:base64Binary(\"aaaa\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1311() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:base64Binary as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1312() {
    final XQuery query = new XQuery(
      "not(xs:base64Binary(\"aaaa\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:hexBinary constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1313() {
    final XQuery query = new XQuery(
      "xs:hexBinary()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:hexBinary constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1314() {
    final XQuery query = new XQuery(
      "xs:hexBinary( \"0FB7\" , \"0FB7\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:hexBinary constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1315() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:hexBinary(\"0FB7\")), 3, 1) instance of xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:hexBinary..
   */
  @org.junit.Test
  public void kSeqExprCast1316() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\" 0FB7 \") eq xs:hexBinary(\" 0FB7 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is a valid lexical representation of xs:hexBinary..
   */
  @org.junit.Test
  public void kSeqExprCast1317() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"\") eq xs:hexBinary(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "0FB7" ..
   */
  @org.junit.Test
  public void kSeqExprCast1318() {
    final XQuery query = new XQuery(
      "xs:hexBinary(xs:untypedAtomic( \"0FB7\" )) eq xs:hexBinary(\"0FB7\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:hexBinary, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast1319() {
    final XQuery query = new XQuery(
      "boolean(xs:hexBinary(\"0FB7\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("12"))) eq "Eg=="`..
   */
  @org.junit.Test
  public void kSeqExprCast132() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"12\"))) eq \"Eg==\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1320() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1321() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1322() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1323() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1324() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1325() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1326() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1327() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1328() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1329() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("3B"))) eq "Ow=="`..
   */
  @org.junit.Test
  public void kSeqExprCast133() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"3B\"))) eq \"Ow==\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1330() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1331() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1332() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1333() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1334() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1335() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1336() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1337() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1338() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1339() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("69A69A"))) eq "aaaa"`..
   */
  @org.junit.Test
  public void kSeqExprCast134() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"69A69A\"))) eq \"aaaa\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1340() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1341() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1342() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1343() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1344() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1345() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1346() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1347() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1348() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1349() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("F43D1234ce8f"))) eq "9D0SNM6P"`..
   */
  @org.junit.Test
  public void kSeqExprCast135() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"F43D1234ce8f\"))) eq \"9D0SNM6P\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1350() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1351() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1352() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1353() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1354() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1355() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:base64Binary is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1356() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:base64Binary ne xs:base64Binary(\"aaaa\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:base64Binary as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1357() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") castable as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:hexBinary is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1358() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:hexBinary eq xs:hexBinary(\"0FB7\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:hexBinary as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1359() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") castable as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("f0"))) eq "8A=="`..
   */
  @org.junit.Test
  public void kSeqExprCast136() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"f0\"))) eq \"8A==\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1360() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1361() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:hexBinary to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1362() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0FB7\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1363() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:hexBinary as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1364() {
    final XQuery query = new XQuery(
      "not(xs:hexBinary(\"0FB7\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:anyURI constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1365() {
    final XQuery query = new XQuery(
      "xs:anyURI()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:anyURI constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1366() {
    final XQuery query = new XQuery(
      "xs:anyURI( \"http://www.example.com/an/arbitrary/URI.ext\" , \"http://www.example.com/an/arbitrary/URI.ext\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:anyURI constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1367() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\")), 3, 1) instance of xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:anyURI..
   */
  @org.junit.Test
  public void kSeqExprCast1368() {
    final XQuery query = new XQuery(
      "xs:anyURI(\" http://www.example.com/an/arbitrary/URI.ext \") eq xs:anyURI(\" http://www.example.com/an/arbitrary/URI.ext \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is a valid lexical representation of xs:anyURI..
   */
  @org.junit.Test
  public void kSeqExprCast1369() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"\") eq xs:anyURI(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("ffaabbddcceeff0134f001d8ca9bc77899c83e6f7d"))) eq "/6q73czu/wE08AHYypvHeJnIPm99"`..
   */
  @org.junit.Test
  public void kSeqExprCast137() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"ffaabbddcceeff0134f001d8ca9bc77899c83e6f7d\"))) eq \"/6q73czu/wE08AHYypvHeJnIPm99\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "http://www.example.com/an/arbitrary/URI.ext" ..
   */
  @org.junit.Test
  public void kSeqExprCast1370() {
    final XQuery query = new XQuery(
      "xs:anyURI(xs:untypedAtomic( \"http://www.example.com/an/arbitrary/URI.ext\" )) \n" +
      "      eq xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:anyURI that has the lexical value 
   *       ' "http://www.example.com/an/arbitrary/URI.ext" ' should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast1371() {
    final XQuery query = new XQuery(
      "boolean(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1372() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:untypedAtomic\n" +
      "      ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1373() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1374() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1375() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1376() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1377() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1378() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1379() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("ffff"))) eq "//8="`..
   */
  @org.junit.Test
  public void kSeqExprCast138() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"ffff\"))) eq \"//8=\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1380() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1381() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1382() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1383() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1384() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1385() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1386() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1387() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1388() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1389() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:base64Binary(xs:hexBinary("ffff34564321deac9876"))) eq "//80VkMh3qyYdg=="`..
   */
  @org.junit.Test
  public void kSeqExprCast139() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(xs:hexBinary(\"ffff34564321deac9876\"))) eq \"//80VkMh3qyYdg==\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1390() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1391() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1392() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1393() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1394() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1395() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1396() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1397() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1398() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1399() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `'1' cast as xs:boolean eq true()`..
   */
  @org.junit.Test
  public void kSeqExprCast14() {
    final XQuery query = new XQuery(
      "'1' cast as xs:boolean eq true()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary(xs:base64Binary("Ow=="))) eq "3B"`..
   */
  @org.junit.Test
  public void kSeqExprCast140() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(xs:base64Binary(\"Ow==\"))) eq \"3B\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1400() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1401() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1402() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1403() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1404() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1405() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1406() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1407() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1408() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1409() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:hexBinary(xs:base64Binary("aaa a"))) eq "69A69A"`..
   */
  @org.junit.Test
  public void kSeqExprCast141() {
    final XQuery query = new XQuery(
      "xs:string(xs:hexBinary(xs:base64Binary(\"aaa a\"))) eq \"69A69A\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1410() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1411() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:anyURI is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1412() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:anyURI eq xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:anyURI as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1413() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:anyURI to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1414() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:anyURI as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1415() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:anyURI as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1416() {
    final XQuery query = new XQuery(
      "not(xs:anyURI(\"http://www.example.com/an/arbitrary/URI.ext\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:QName constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1417() {
    final XQuery query = new XQuery(
      "xs:QName()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:QName constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1418() {
    final XQuery query = new XQuery(
      "xs:QName( \"ncname\" , \"ncname\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:QName constructor function produces values 
   *         of the correct type. The subsequence() function makes it more difficult for optimizers to take 
   *         short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast1419() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:QName(\"ncname\")), 3, 1) instance of xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is a valid lexical representation for xs:base64Binary, and means 'no data..
   */
  @org.junit.Test
  public void kSeqExprCast142() {
    final XQuery query = new XQuery(
      "xs:string(xs:base64Binary(\"\")) eq \"\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:QName..
   */
  @org.junit.Test
  public void kSeqExprCast1420() {
    final XQuery query = new XQuery(
      "xs:QName(\" ncname \") eq xs:QName(\" ncname \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:QName..
   */
  @org.junit.Test
  public void kSeqExprCast1421() {
    final XQuery query = new XQuery(
      "xs:QName(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:QName, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast1422() {
    final XQuery query = new XQuery(
      "boolean(xs:QName(\"ncname\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:QName to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1423() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1424() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast1425() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1426() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1427() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1428() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1429() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  Casting where the source type typically cannot be determined statically..
   */
  @org.junit.Test
  public void kSeqExprCast143() {
    final XQuery query = new XQuery(
      "xs:hexBinary(remove((\"3B\", 1.1), 2) treat as xs:string)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3B")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1430() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1431() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1432() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1433() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1434() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1435() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1436() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1437() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1438() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1439() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  A test whose essence is: `(xs:decimal(remove((3e3, 1.1), 1))) eq 1.1`..
   */
  @org.junit.Test
  public void kSeqExprCast144() {
    final XQuery query = new XQuery(
      "(xs:decimal(remove((3e3, 1.1), 1))) eq 1.1",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertBoolean(true)
      ||
        error("XPTY0004")
      )
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1440() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1441() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1442() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1443() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1444() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1445() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1446() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1447() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1448() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1449() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  Casting where the cardinality of the source value is wrong..
   */
  @org.junit.Test
  public void kSeqExprCast145() {
    final XQuery query = new XQuery(
      "xs:decimal(remove((1, 2, 3), 1))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1450() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1451() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1452() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1453() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1454() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1455() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1456() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1457() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1458() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1459() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1460() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1461() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1462() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:QName to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast1463() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast1464() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:QName as source type and xs:QName as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast1465() {
    final XQuery query = new XQuery(
      "xs:QName(\"ncname\") castable as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:QName as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1466() {
    final XQuery query = new XQuery(
      "not(xs:QName(\"ncname\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:NOTATION constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast1467() {
    final XQuery query = new XQuery(
      "xs:NOTATION()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:NOTATION constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast1468() {
    final XQuery query = new XQuery(
      "xs:NOTATION( \"prefix:local\" , \"prefix:local\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1469() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:untypedAtomic)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  A preceding plus sign('+') is disallowed for xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast147() {
    final XQuery query = new XQuery(
      "xs:duration(\"+P1Y2M123DT10H30M99S\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1470() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:string)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1471() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1472() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1473() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1474() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1475() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1476() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1477() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1478() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1479() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No zone offset is allowed for xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast148() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M123DT10H30M99S+08:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1480() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1481() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1482() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1483() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1484() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1485() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1486() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1487() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1488() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1489() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  A preceding 'P' must always exist in a xs:duration value..
   */
  @org.junit.Test
  public void kSeqExprCast149() {
    final XQuery query = new XQuery(
      "xs:duration(\"1Y2M123DT10H30M99S\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1490() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No constructor function exists for xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast1491() {
    final XQuery query = new XQuery(
      "not(xs:NOTATION(\"prefix:local\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0017")
      ||
        error("XPST0080")
      )
    );
  }

  /**
   *  A test whose essence is: `'true' cast as xs:boolean eq true()`..
   */
  @org.junit.Test
  public void kSeqExprCast15() {
    final XQuery query = new XQuery(
      "'true' cast as xs:boolean eq true()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  At least one number and its designator must be present in a xs:duration value..
   */
  @org.junit.Test
  public void kSeqExprCast150() {
    final XQuery query = new XQuery(
      "xs:duration(\"P\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  At least one number and its designator must be present in a xs:duration value, a minus sign is insufficient..
   */
  @org.junit.Test
  public void kSeqExprCast151() {
    final XQuery query = new XQuery(
      "xs:duration(\"-P\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A 'T' separator in a xs:duration must be followed by time components..
   */
  @org.junit.Test
  public void kSeqExprCast152() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y24MT\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'P24H' is an invalid lexical representation for xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast153() {
    final XQuery query = new XQuery(
      "xs:duration(\"P24H\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure that when casting xs:duration to xs:string, preceding zeros are handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast154() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"P0010Y0010M0010DT0010H0010M0010S\")) eq \"P10Y10M10DT10H10M10S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure that a negative xs:duration is properly serialized when cast to xs:string..
   */
  @org.junit.Test
  public void kSeqExprCast155() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"-P0010DT0010H0010M0010S\")) eq \"-P10DT10H10M10S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure that when casting xs:duration to xs:string, that empty fields are properly serialized..
   */
  @org.junit.Test
  public void kSeqExprCast156() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"P0Y0M0DT00H00M00.000S\")) eq \"PT0S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure that when casting xs:duration to xs:string, that empty components are handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast157() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"-PT8H23M0S\")) eq \"-PT8H23M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting a xs:duration with zeroed time components to xs:string..
   */
  @org.junit.Test
  public void kSeqExprCast158() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"-P2000Y11M5DT0H0M0.000S\")) eq \"-P2000Y11M5D\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical lexical representation for the xs:duration value P365D is 'P365D'..
   */
  @org.junit.Test
  public void kSeqExprCast159() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"P365D\")) eq \"P365D\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `'false' cast as xs:boolean eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast16() {
    final XQuery query = new XQuery(
      "'false' cast as xs:boolean eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical lexical representation for the xs:duration value P12M is 'P1Y'..
   */
  @org.junit.Test
  public void kSeqExprCast160() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"P12M\")) eq \"P1Y\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical lexical representation for the xs:duration value P31D is 'P31D'..
   */
  @org.junit.Test
  public void kSeqExprCast161() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"P31D\")) eq \"P31D\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical lexical representation for the xs:duration value P3Y0M is 'P3Y'..
   */
  @org.junit.Test
  public void kSeqExprCast162() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(\"P3Y0M\")) eq \"P3Y\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:duration value with a small second component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast163() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"P31DT3H2M10.001S\")) eq \"P31DT3H2M10.001S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical form of the xs:duration value -PT0S is PT0S..
   */
  @org.junit.Test
  public void kSeqExprCast164() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(\"-PT0S\")) eq \"PT0S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting xs:dayTimeDuration to xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast165() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(xs:dayTimeDuration(\"P31DT3H2M10.001S\"))) eq \"P31DT3H2M10.001S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting xs:yearMonthDuration to xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast166() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(xs:yearMonthDuration(\"P543Y456M\"))) eq \"P581Y\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a negative xs:dayTimeDuration to xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast167() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(xs:dayTimeDuration(\"-P31DT3H2M10.001S\"))) eq \"-P31DT3H2M10.001S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a negative xs:yearMonthDuration to xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast168() {
    final XQuery query = new XQuery(
      "xs:string(xs:duration(xs:yearMonthDuration(\"-P543Y456M\"))) eq \"-P581Y\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A preceding plus sign('+') is disallowed for xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast169() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"+P3DT10H\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `'0' cast as xs:boolean eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast17() {
    final XQuery query = new XQuery(
      "'0' cast as xs:boolean eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  No zone offset is allowed for xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast170() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT10H+08:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A preceding 'P' must always exist in a xs:dayTimeDuration value..
   */
  @org.junit.Test
  public void kSeqExprCast171() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"3DT10H\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  At least one number and its designator must be present in a xs:dayTimeDuration value..
   */
  @org.junit.Test
  public void kSeqExprCast172() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  At least one number and its designator must be present in a xs:dayTimeDuration value, a minus sign is insufficient..
   */
  @org.junit.Test
  public void kSeqExprCast173() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"-P\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A 'T' separator in a xs:dayTimeDuration must be followed by time components..
   */
  @org.junit.Test
  public void kSeqExprCast174() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P1DT\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure that when casting xs:dayTimeDuration to xs:string, that empty fields are properly serialized..
   */
  @org.junit.Test
  public void kSeqExprCast175() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"P0DT00H00M00.000S\")) eq \"PT0S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'P1Y12M1D' is an invalid lexical representation for xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast176() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P1Y12M1D\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'P24M1D' is an invalid lexical representation for xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast177() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P24M1D\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'PDT3H2M10.001S' is an invalid lexical representation for xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast178() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"PDT3H2M10.001S\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure that when casting xs:dayTimeDuration to xs:string, that preceding zeros are handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast179() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"P0010DT0010H0010M0010S\")) eq \"P10DT10H10M10S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `false() cast as xs:boolean eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast18() {
    final XQuery query = new XQuery(
      "false() cast as xs:boolean eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure that a negative xs:dayTimeDuration is properly serialized when cast to xs:string..
   */
  @org.junit.Test
  public void kSeqExprCast180() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"-P0010DT0010H0010M0010S\")) eq \"-P10DT10H10M10S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure that when casting xs:dayTimeDuration to xs:string, that empty components are handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast181() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"-PT8H23M0S\")) eq \"-PT8H23M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting a xs:duration with zeroed time components to xs:string..
   */
  @org.junit.Test
  public void kSeqExprCast182() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"-P5DT0H0M0.000S\")) eq \"-P5D\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:dayTimeDuration value with a large day component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast183() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"P9876DT1M\")) eq \"P9876DT1M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:dayTimeDuration value with a large hour component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast184() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"PT9876H1M\")) eq \"P411DT12H1M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:dayTimeDuration value with a large minute component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast185() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"PT6000M\")) eq \"P4DT4H\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:dayTimeDuration value with a large second component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast186() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"PT1M1231.432S\")) eq \"PT21M31.432S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:dayTimeDuration value with a small second component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast187() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"P31DT3H2M10.001S\")) eq \"P31DT3H2M10.001S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical form of the xs:dayTimeDuration value -PT0S is PT0S..
   */
  @org.junit.Test
  public void kSeqExprCast188() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"-PT0S\")) eq \"PT0S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting xs:duration to xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast189() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(xs:duration(\"P3Y0M31DT3H2M10.001S\"))) eq \"P31DT3H2M10.001S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `not(true() cast as xs:boolean eq false())`..
   */
  @org.junit.Test
  public void kSeqExprCast19() {
    final XQuery query = new XQuery(
      "not(true() cast as xs:boolean eq false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting xs:yearMonthDuration to xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast190() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(xs:yearMonthDuration(\"P543Y456M\"))) eq \"PT0S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a negative xs:duration to xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast191() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(xs:duration(\"-P3Y0M31DT3H2M10.001S\"))) eq \"-P31DT3H2M10.001S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a negative xs:yearMonthDuration to xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast192() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(xs:yearMonthDuration(\"-P543Y456M\"))) eq \"PT0S\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical lexical representation for the xs:dayTimeDuration value P3D is 'P3D'..
   */
  @org.junit.Test
  public void kSeqExprCast193() {
    final XQuery query = new XQuery(
      "xs:string(xs:dayTimeDuration(\"P3D\")) eq \"P3D\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A preceding plus sign('+') is disallowed for xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast194() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"+P20Y15M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  No zone offset is allowed for xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast195() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P20Y15M+08:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A preceding 'P' must always exist in a xs:yearMonthDuration value..
   */
  @org.junit.Test
  public void kSeqExprCast196() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"20Y15M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  At least one number and its designator must be present in a xs:yearMonthDuration value..
   */
  @org.junit.Test
  public void kSeqExprCast197() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  At least one number and its designator must be present in a xs:yearMonthDuration value, a minus sign is insufficient..
   */
  @org.junit.Test
  public void kSeqExprCast198() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"-P\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A 'T' separator in a xs:yearMonthDuration is not allowed..
   */
  @org.junit.Test
  public void kSeqExprCast199() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y24MT\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Syntax: only ? is allowed as occurence indicator in 'cast as' expressions..
   */
  @org.junit.Test
  public void kSeqExprCast2() {
    final XQuery query = new XQuery(
      "'string' cast as xs:string+",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0003")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:double(3)) eq true()`..
   */
  @org.junit.Test
  public void kSeqExprCast20() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:double(3)) eq true()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'P731D' is an invalid lexical representation for xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast200() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P731D\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '-P3' is an invalid lexical representation for xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast201() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"-P3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure that when casting xs:yearMonthDuration to xs:string, that preceding zeros are handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast202() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(\"P0010Y0010M\")) eq \"P10Y10M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure that a negative xs:yearMonthDuration is properly serialized when cast to xs:string..
   */
  @org.junit.Test
  public void kSeqExprCast203() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(\"-P0010Y0010M\")) eq \"-P10Y10M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure that when casting xs:yearMonthDuration to xs:string, that empty fields are properly serialized..
   */
  @org.junit.Test
  public void kSeqExprCast204() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(\"P0Y0M\")) eq \"P0M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:yearMonthDuration value with a large year component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast205() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(\"P2Y323M\")) eq \"P28Y11M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Test that a xs:yearMonthDuration value with a large year and month component is serialized properly..
   */
  @org.junit.Test
  public void kSeqExprCast206() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(\"-P543Y456M\")) eq \"-P581Y\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical form of the xs:yearMonthDuration value -P0M is P0M..
   */
  @org.junit.Test
  public void kSeqExprCast207() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(\"-P0M\")) eq \"P0M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting xs:duration to xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast208() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(xs:duration(\"P3Y0M31DT3H2M10.001S\"))) eq \"P3Y\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting xs:dayTimeDuration to xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast209() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(xs:dayTimeDuration(\"P31DT3H2M10.001S\"))) eq \"P0M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:string(1)) eq true()`..
   */
  @org.junit.Test
  public void kSeqExprCast21() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:string(1)) eq true()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a negative xs:duration to xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast210() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(xs:duration(\"-P3Y0M31DT3H2M10.001S\"))) eq \"-P3Y\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a negative xs:dayTimeDuration to xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast211() {
    final XQuery query = new XQuery(
      "xs:string(xs:yearMonthDuration(xs:dayTimeDuration(\"-P31DT3H2M10.001S\"))) eq \"P0M\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("1")`..
   */
  @org.junit.Test
  public void kSeqExprCast213() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("12")`..
   */
  @org.junit.Test
  public void kSeqExprCast214() {
    final XQuery query = new XQuery(
      "xs:gYear(\"12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("867")`..
   */
  @org.junit.Test
  public void kSeqExprCast215() {
    final XQuery query = new XQuery(
      "xs:gYear(\"867\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("+1999")`..
   */
  @org.junit.Test
  public void kSeqExprCast216() {
    final XQuery query = new XQuery(
      "xs:gYear(\"+1999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("+1999")`..
   */
  @org.junit.Test
  public void kSeqExprCast217() {
    final XQuery query = new XQuery(
      "xs:gYear(\"+1999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("+0000")`..
   */
  @org.junit.Test
  public void kSeqExprCast218() {
    final XQuery query = new XQuery(
      "xs:gYear(\"+0000\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("1111-")`..
   */
  @org.junit.Test
  public void kSeqExprCast219() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1111-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:integer(3)) eq true()`..
   */
  @org.junit.Test
  public void kSeqExprCast22() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:integer(3)) eq true()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("1111a")`..
   */
  @org.junit.Test
  public void kSeqExprCast220() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1111a\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("a1111")`..
   */
  @org.junit.Test
  public void kSeqExprCast221() {
    final XQuery query = new XQuery(
      "xs:gYear(\"a1111\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("1 111")`..
   */
  @org.junit.Test
  public void kSeqExprCast222() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1 111\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("1111 Z")`..
   */
  @org.junit.Test
  public void kSeqExprCast223() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1111 Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:gYear("1111 Z")`..
   */
  @org.junit.Test
  public void kSeqExprCast224() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1111 Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYear: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast225() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1956-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYear: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast226() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1956+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYear: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast227() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1956+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYear: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast228() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1956-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '02004' is an invalid lexical representation for xs:gYear..
   */
  @org.junit.Test
  public void kSeqExprCast229() {
    final XQuery query = new XQuery(
      "xs:gYear(\"02004\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:decimal(3)) eq true()`..
   */
  @org.junit.Test
  public void kSeqExprCast23() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:decimal(3)) eq true()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Testing timezone field in xs:gYear: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast230() {
    final XQuery query = new XQuery(
      "xs:gYear(\"1956-10\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure casting xs:gYear to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast231() {
    final XQuery query = new XQuery(
      "xs:string(xs:gYear(\"1999-00:00\")) eq \"1999Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gYear to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast232() {
    final XQuery query = new XQuery(
      "xs:string(xs:gYear(\"1999+00:00\")) eq \"1999Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gYear to xs:string, with timezone 'Z' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast233() {
    final XQuery query = new XQuery(
      "xs:string(xs:gYear(\"1999Z\")) eq \"1999Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '10' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast234() {
    final XQuery query = new XQuery(
      "xs:gDay(\"10\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '-01' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast235() {
    final XQuery query = new XQuery(
      "xs:gDay(\"-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---321' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast236() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---321\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--01' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast237() {
    final XQuery query = new XQuery(
      "xs:gDay(\"--01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'E---01' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast238() {
    final XQuery query = new XQuery(
      "xs:gDay(\"E---01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---01E' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast239() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---01E\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:double(0)) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast24() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:double(0)) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '---01-' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast240() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---01-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---001' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast241() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---32' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast242() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---32\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---00' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast243() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---8' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast244() {
    final XQuery query = new XQuery(
      "xs:gDay(\"+--08\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+--08' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast245() {
    final XQuery query = new XQuery(
      "xs:gDay(\"+--08\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+---08' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast246() {
    final XQuery query = new XQuery(
      "xs:gDay(\"+---08\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---08 Z' is an invalid lexical representation for xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast247() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---08 Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gDay: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast248() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---08-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gDay: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast249() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---08+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:string(0)) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast25() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:string(0)) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Testing timezone field in xs:gDay: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast250() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---08+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gDay: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast251() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---08-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gDay: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast252() {
    final XQuery query = new XQuery(
      "xs:gDay(\"---08-10\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure casting xs:gDay to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast253() {
    final XQuery query = new XQuery(
      "xs:string(xs:gDay(\"---01-00:00\")) eq \"---01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gDay to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast254() {
    final XQuery query = new XQuery(
      "xs:string(xs:gDay(\"---01+00:00\")) eq \"---01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gDay to xs:string, with timezone 'Z' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast255() {
    final XQuery query = new XQuery(
      "xs:string(xs:gDay(\"---01Z\")) eq \"---01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '-01' is an invalid lexical representation for xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast256() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '---01' is an invalid lexical representation for xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast257() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"---01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+--01' is an invalid lexical representation for xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast258() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"+--01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--13' is an invalid lexical representation for xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast259() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:integer(0)) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast26() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:integer(0)) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '--431' is an invalid lexical representation for xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast260() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--431\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--11-' is an invalid lexical representation for xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast261() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--11-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--00' is an invalid lexical representation for xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast262() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonth: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast263() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--08-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonth: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast264() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--08+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonth: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast265() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--08+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonth: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast266() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--08-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonth: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast267() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--08-10\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure casting xs:gMonth to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast268() {
    final XQuery query = new XQuery(
      "xs:string(xs:gMonth(\"--01-00:00\")) eq \"--01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gMonth to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast269() {
    final XQuery query = new XQuery(
      "xs:string(xs:gMonth(\"--01+00:00\")) eq \"--01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:decimal(0)) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast27() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:decimal(0)) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gMonth to xs:string, with timezone 'Z' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast270() {
    final XQuery query = new XQuery(
      "xs:string(xs:gMonth(\"--01Z\")) eq \"--01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '--1999-12' is an invalid lexical representation for xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast271() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"--1999-12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+1999-12' is an invalid lexical representation for xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast272() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"+1999-12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '1999-12-' is an invalid lexical representation for xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast273() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-12-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '1999--12' is an invalid lexical representation for xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast274() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999--12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '1999-13' is an invalid lexical representation for xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast275() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '1999-00' is an invalid lexical representation for xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast276() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '02004-08' is an invalid lexical representation for xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast277() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"02004-08\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYearMonth: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast278() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-08-10\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYearMonth: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast279() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-01-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:decimal(0.0)) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast28() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:decimal(0.0)) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Testing timezone field in xs:gYearMonth: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast280() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-01+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYearMonth: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast281() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-01+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gYearMonth: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast282() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-01-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure casting xs:gYearMonth to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast283() {
    final XQuery query = new XQuery(
      "xs:string(xs:gYearMonth(\"1999-01-00:00\")) eq \"1999-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gYearMonth to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast284() {
    final XQuery query = new XQuery(
      "xs:string(xs:gYearMonth(\"1999-01+00:00\")) eq \"1999-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gYearMonth to xs:string, with timezone 'Z' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast285() {
    final XQuery query = new XQuery(
      "xs:string(xs:gYearMonth(\"1999-01Z\")) eq \"1999-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '-01-12' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast286() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"-01-12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+--01-12' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast287() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"+--01-12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '01-12-' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast288() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"01-12-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--01--12' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast289() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--01--12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(+0) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast29() {
    final XQuery query = new XQuery(
      "xs:boolean(+0) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '--01-00' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast290() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--01-00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--00-01' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast291() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--00-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--13-01' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast292() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--13-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--111-01' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast293() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--111-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--1967-01' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast294() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--1967-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--02-31' is an invalid lexical representation for xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast295() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--02-31\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonthDay: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast296() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-08-10\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The xs:gMonthDay value '--02-30' represents a non-existent date..
   */
  @org.junit.Test
  public void kSeqExprCast297() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--02-30\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The xs:gMonthDay value '--04-31' represents a non-existent date..
   */
  @org.junit.Test
  public void kSeqExprCast298() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--04-31\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The xs:gMonthDay value '--11-31' represents a non-existent date..
   */
  @org.junit.Test
  public void kSeqExprCast299() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--11-31\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Syntax: only ? is allowed as occurence indicator in 'cast as' expressions..
   */
  @org.junit.Test
  public void kSeqExprCast3() {
    final XQuery query = new XQuery(
      "'string' cast as xs:anyType*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0003")
      ||
        error("XPST0051")
      )
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(-0) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast30() {
    final XQuery query = new XQuery(
      "xs:boolean(-0) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Testing timezone field in xs:gMonthDay: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast300() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--01-01-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonthDay: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast301() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--01-01+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonthDay: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast302() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--01-01+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:gMonthDay: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast303() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--01-01-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Ensure casting xs:gMonthDay to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast304() {
    final XQuery query = new XQuery(
      "xs:string(xs:gMonthDay(\"--01-01-00:00\")) eq \"--01-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gMonthDay to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast305() {
    final XQuery query = new XQuery(
      "xs:string(xs:gMonthDay(\"--01-01+00:00\")) eq \"--01-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:gMonthDay to xs:string, with timezone 'Z' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast306() {
    final XQuery query = new XQuery(
      "xs:string(xs:gMonthDay(\"--01-01Z\")) eq \"--01-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple xs:gMonthDay test involving --02-29..
   */
  @org.junit.Test
  public void kSeqExprCast307() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(\"--02-29+00:00\") eq xs:gMonthDay(\"--02-29+00:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '+2004-08-01T12:44:05' is an invalid lexical representation, a preceding '+' sign is not allowed for xs:dateTime..
   */
  @org.junit.Test
  public void kSeqExprCast308() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"+2004-08-01T12:44:05\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '02004-08-01T12:44:05' is an invalid lexical representation for xs:dateTime; if the year part has more than four digits, leading zeros are prohibited..
   */
  @org.junit.Test
  public void kSeqExprCast309() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"02004-08-01T12:44:05\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:double(+0)) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast31() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:double(+0)) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '00004-08-01T12:44:05' is an invalid lexical representation for xs:dateTime; if the year part has more than four digits, leading zeros are prohibited..
   */
  @org.junit.Test
  public void kSeqExprCast310() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"00004-08-01T12:44:05\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2004-32-01T12:44:05' is an invalid lexical representation for xs:dateTime; the month part cannot be larger than 32..
   */
  @org.junit.Test
  public void kSeqExprCast311() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2004-32-01T12:44:05\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-30T12:44:05' is a non-existent xs:dateTime date..
   */
  @org.junit.Test
  public void kSeqExprCast312() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-02-30T12:44:05\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-002-15T12:44:05' is an invalid lexical representation for xs:dateTime..
   */
  @org.junit.Test
  public void kSeqExprCast313() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-002-15T12:44:05\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-150T12:44:05' is an invalid lexical representation for xs:dateTime..
   */
  @org.junit.Test
  public void kSeqExprCast314() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-02-150T12:44:05\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-15T24:00:00.001' is an invalid lexical representation for xs:dateTime; if hour is 24, seconds part must be 00..
   */
  @org.junit.Test
  public void kSeqExprCast315() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-02-15T24:00:00.001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-15T24:01:00' is an invalid lexical representation for xs:dateTime; if hour is 24, minutes part must be 00..
   */
  @org.junit.Test
  public void kSeqExprCast316() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-02-15T24:01:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-15T25:00:00' is an invalid lexical representation for xs:dateTime; hour part can never be larger than 24..
   */
  @org.junit.Test
  public void kSeqExprCast317() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-02-15T25:01:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-15T21:60:00' is an invalid lexical representation for xs:dateTime; minute part can never be larger than 59..
   */
  @org.junit.Test
  public void kSeqExprCast318() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-02-15T21:60:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-15T21:01:60' is an invalid lexical representation for xs:dateTime; seconds part can never be larger than 59..
   */
  @org.junit.Test
  public void kSeqExprCast319() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-02-15T21:01:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:double(-0)) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast32() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:double(-0)) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '--2002-02-15T21:01:23' is an invalid lexical representation for xs:dateTime..
   */
  @org.junit.Test
  public void kSeqExprCast320() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"--2002-02-15T21:01:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:dateTime: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast321() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-01T23:59:12.432-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:dateTime: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast322() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-01T23:59:12.432+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:dateTime: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast323() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-01T23:59:12.432+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:dateTime: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast324() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-01T23:59:12.432-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:dateTime: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast325() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-01T23:59:12.999-00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC timezone to xs:gYear..
   */
  @org.junit.Test
  public void kSeqExprCast326() {
    final XQuery query = new XQuery(
      "xs:gYear(xs:dateTime(\"2002-11-23T23:12:23.867-00:00\")) eq xs:gYear(\"2002Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC offset to xs:gYear..
   */
  @org.junit.Test
  public void kSeqExprCast327() {
    final XQuery query = new XQuery(
      "xs:gYear(xs:dateTime(\"2002-11-23T23:12:23.867-13:37\")) eq xs:gYear(\"2002-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC timezone to xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast328() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(xs:dateTime(\"2002-11-23T23:12:23.867-00:00\")) eq xs:gYearMonth(\"2002-11Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC offset to xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast329() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(xs:dateTime(\"2002-11-23T23:12:23.867-13:37\")) eq xs:gYearMonth(\"2002-11-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(0.0E0) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast33() {
    final XQuery query = new XQuery(
      "xs:boolean(0.0E0) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC timezone to xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast330() {
    final XQuery query = new XQuery(
      "xs:gMonth(xs:dateTime(\"2002-11-23T22:12:23.867-00:00\")) eq xs:gMonth(\"--11Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC offset to xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast331() {
    final XQuery query = new XQuery(
      "xs:gMonth(xs:dateTime(\"2002-11-23T22:12:23.867-13:37\")) eq xs:gMonth(\"--11-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC timezone to xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast332() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(xs:dateTime(\"2002-11-23T22:12:23.867-00:00\")) eq xs:gMonthDay(\"--11-23Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC offset to xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast333() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(xs:dateTime(\"2002-11-23T22:12:23.867-13:37\")) eq xs:gMonthDay(\"--11-23-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC timezone to xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast334() {
    final XQuery query = new XQuery(
      "xs:gDay(xs:dateTime(\"2002-11-23T22:12:23.867-00:00\")) eq xs:gDay(\"---23Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC offset to xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast335() {
    final XQuery query = new XQuery(
      "xs:gDay(xs:dateTime(\"2002-11-23T22:12:23.867-13:37\")) eq xs:gDay(\"---23-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC timezone to xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast336() {
    final XQuery query = new XQuery(
      "xs:date(xs:dateTime(\"2002-11-23T22:12:23.867-00:00\")) eq xs:date(\"2002-11-23Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC offset to xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast337() {
    final XQuery query = new XQuery(
      "xs:date(xs:dateTime(\"2002-11-23T22:12:23.867-13:37\")) eq xs:date(\"2002-11-23-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC timezone to xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast338() {
    final XQuery query = new XQuery(
      "xs:time(xs:dateTime(\"2002-11-23T22:12:23.867-00:00\")) eq xs:time(\"22:12:23.867Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:dateTime with UTC offset to xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast339() {
    final XQuery query = new XQuery(
      "xs:time(xs:dateTime(\"2002-11-23T22:12:23.867-13:37\")) eq xs:time(\"22:12:23.867-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:double("NaN")) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast34() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:double(\"NaN\")) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:dateTime to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast340() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"1999-12-01T23:59:12.999-00:00\")) eq \"1999-12-01T23:59:12.999Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:dateTime to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast341() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"1999-12-01T23:59:12.432+00:00\")) eq \"1999-12-01T23:59:12.432Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:dateTime to xs:string that an empty milli seconds part is not serialized..
   */
  @org.junit.Test
  public void kSeqExprCast342() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"2002-02-15T21:01:23.000\")) eq \"2002-02-15T21:01:23\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:dateTime to xs:string that milli seconds have no trailing zeros..
   */
  @org.junit.Test
  public void kSeqExprCast343() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"2002-02-15T21:01:23.100\")) eq \"2002-02-15T21:01:23.1\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:dateTime to xs:string that milli seconds are properly padded with zeros..
   */
  @org.junit.Test
  public void kSeqExprCast344() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"2002-02-15T21:01:23.001\")) eq \"2002-02-15T21:01:23.001\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:dateTime to xs:string that milli seconds are properly padded with zeros..
   */
  @org.junit.Test
  public void kSeqExprCast345() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"2002-02-15T21:01:23.010\")) eq \"2002-02-15T21:01:23.01\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:dateTime to xs:string that a milli seconds part of '435' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast346() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"2002-02-15T21:01:23.435\")) eq \"2002-02-15T21:01:23.435\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:dateTime to xs:string that a milli seconds part of '11' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast347() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"2002-02-15T21:01:23.11\")) eq \"2002-02-15T21:01:23.11\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:dateTime to xs:string that a milli seconds part of '110' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast348() {
    final XQuery query = new XQuery(
      "xs:string(xs:dateTime(\"2002-02-15T21:01:23.110\")) eq \"2002-02-15T21:01:23.11\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple xs:dateTime involving time with no milli seconds..
   */
  @org.junit.Test
  public void kSeqExprCast349() {
    final XQuery query = new XQuery(
      "string(xs:dateTime(\"2000-08-01T12:44:05\")) eq \"2000-08-01T12:44:05\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:boolean(xs:float("NaN")) eq false()`..
   */
  @org.junit.Test
  public void kSeqExprCast35() {
    final XQuery query = new XQuery(
      "xs:boolean(xs:float(\"NaN\")) eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical form of an xs:dateTime containing 24:00:00 is the following day at 00:00:00..
   */
  @org.junit.Test
  public void kSeqExprCast350() {
    final XQuery query = new XQuery(
      "string(xs:dateTime(\"2004-03-31T24:00:00\")) eq \"2004-04-01T00:00:00\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '24:00:00.001' is an invalid lexical representation for xs:time; if hour is 24, seconds part must be 00..
   */
  @org.junit.Test
  public void kSeqExprCast351() {
    final XQuery query = new XQuery(
      "xs:time(\"24:00:00.001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '24:01:00' is an invalid lexical representation for xs:time; if hour is 24, minutes part must be 00..
   */
  @org.junit.Test
  public void kSeqExprCast352() {
    final XQuery query = new XQuery(
      "xs:time(\"24:01:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '25:00:00' is an invalid lexical representation for xs:time; hour part can never be larger than 24..
   */
  @org.junit.Test
  public void kSeqExprCast353() {
    final XQuery query = new XQuery(
      "xs:time(\"25:01:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '21:60:00' is an invalid lexical representation for xs:time; minute part can never be larger than 59..
   */
  @org.junit.Test
  public void kSeqExprCast354() {
    final XQuery query = new XQuery(
      "xs:time(\"21:60:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '21:01:60' is an invalid lexical representation for xs:time; seconds part can never be larger than 59..
   */
  @org.junit.Test
  public void kSeqExprCast355() {
    final XQuery query = new XQuery(
      "xs:time(\"21:01:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+21:01:50' is an invalid lexical representation for xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast356() {
    final XQuery query = new XQuery(
      "xs:time(\"+21:01:50\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '-21:01:50' is an invalid lexical representation for xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast357() {
    final XQuery query = new XQuery(
      "xs:time(\"-21:01:50\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A valid xs:dateTime is an invalid xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast358() {
    final XQuery query = new XQuery(
      "xs:time(\"2002-02-15T08:12:12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:time: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast359() {
    final XQuery query = new XQuery(
      "xs:time(\"23:59:12.432-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Invalid casting combination, combined with value comparison..
   */
  @org.junit.Test
  public void kSeqExprCast36() {
    final XQuery query = new XQuery(
      "'12312' cast as xs:boolean eq false()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:time: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast360() {
    final XQuery query = new XQuery(
      "xs:time(\"23:59:12.432+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:time: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast361() {
    final XQuery query = new XQuery(
      "xs:time(\"23:59:12.432+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:time: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast362() {
    final XQuery query = new XQuery(
      "xs:time(\"23:59:12.432-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:time: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast363() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"T23:59:12.999-03\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Simple xs:time involving time with no milli seconds..
   */
  @org.junit.Test
  public void kSeqExprCast364() {
    final XQuery query = new XQuery(
      "string(xs:time(\"12:44:05\")) eq \"12:44:05\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:time to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast365() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"23:59:12.999-00:00\")) eq \"23:59:12.999Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:time to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast366() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"23:59:12.432+00:00\")) eq \"23:59:12.432Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:time to xs:string that an empty milli seconds part is not serialized..
   */
  @org.junit.Test
  public void kSeqExprCast367() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"21:01:23.000\")) eq \"21:01:23\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:time to xs:string that milli seconds have no trailing zeros..
   */
  @org.junit.Test
  public void kSeqExprCast368() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"21:01:23.100\")) eq \"21:01:23.1\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:time to xs:string that milli seconds are properly padded with zeros..
   */
  @org.junit.Test
  public void kSeqExprCast369() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"21:01:23.001\")) eq \"21:01:23.001\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `false() cast as xs:string eq "false"`..
   */
  @org.junit.Test
  public void kSeqExprCast37() {
    final XQuery query = new XQuery(
      "false() cast as xs:string eq \"false\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:time to xs:string that milli seconds are properly padded with zeros..
   */
  @org.junit.Test
  public void kSeqExprCast370() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"21:01:23.010\")) eq \"21:01:23.01\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:time to xs:string that a milli seconds part of '435' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast371() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"21:01:23.435\")) eq \"21:01:23.435\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:time to xs:string that a milli seconds part of '11' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast372() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"21:01:23.11\")) eq \"21:01:23.11\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:time to xs:string that a milli seconds part of '110' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast373() {
    final XQuery query = new XQuery(
      "xs:string(xs:time(\"21:01:23.110\")) eq \"21:01:23.11\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The canonical form of an xs:time containing 24:00:00 is 00:00:00..
   */
  @org.junit.Test
  public void kSeqExprCast374() {
    final XQuery query = new XQuery(
      "string(xs:time(\"24:00:00\")) eq \"00:00:00\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '+2004-08-01' is an invalid lexical representation, a preceding '+' sign is not allowed for xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast375() {
    final XQuery query = new XQuery(
      "xs:date(\"+2004-08-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '02004-08-01' is an invalid lexical representation for xs:date; if the year part has more than four digits, leading zeros are prohibited..
   */
  @org.junit.Test
  public void kSeqExprCast376() {
    final XQuery query = new XQuery(
      "xs:date(\"02004-08-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '00004-08-01' is an invalid lexical representation for xs:date; if the year part has more than four digits, leading zeros are prohibited..
   */
  @org.junit.Test
  public void kSeqExprCast377() {
    final XQuery query = new XQuery(
      "xs:date(\"00004-08-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2004-32-01' is an invalid lexical representation for xs:date; the month part cannot be larger than 32..
   */
  @org.junit.Test
  public void kSeqExprCast378() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-32-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-30' is a non-existent xs:date date..
   */
  @org.junit.Test
  public void kSeqExprCast379() {
    final XQuery query = new XQuery(
      "xs:date(\"2002-02-30\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `true() cast as xs:string eq "true"`..
   */
  @org.junit.Test
  public void kSeqExprCast38() {
    final XQuery query = new XQuery(
      "true() cast as xs:string eq \"true\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  '2002-002-15' is an invalid lexical representation for xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast380() {
    final XQuery query = new XQuery(
      "xs:date(\"2002-002-15\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '2002-02-150' is an invalid lexical representation for xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast381() {
    final XQuery query = new XQuery(
      "xs:date(\"2002-02-150\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '--2002-02-15' is an invalid lexical representation for xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast382() {
    final XQuery query = new XQuery(
      "xs:date(\"--2002-02-15\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A valid xs:dateTime is an invalid xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast383() {
    final XQuery query = new XQuery(
      "xs:date(\"2002-02-15T08:12:12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:date: the hour component cannot be -15..
   */
  @org.junit.Test
  public void kSeqExprCast384() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-01-15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:date: the hour component cannot be +15..
   */
  @org.junit.Test
  public void kSeqExprCast385() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-01+15:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:date: the minute component cannot be +60..
   */
  @org.junit.Test
  public void kSeqExprCast386() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-01+10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing timezone field in xs:date: the minute component cannot be -60..
   */
  @org.junit.Test
  public void kSeqExprCast387() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-01-10:60\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Testing datezone field in xs:date: the minute field must always be present..
   */
  @org.junit.Test
  public void kSeqExprCast388() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-01-03\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC timezone to xs:gYear..
   */
  @org.junit.Test
  public void kSeqExprCast389() {
    final XQuery query = new XQuery(
      "xs:gYear(xs:date(\"2002-11-23Z\")) eq xs:gYear(\"2002Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `('1' cast as xs:boolean) cast as xs:string eq 'true'`..
   */
  @org.junit.Test
  public void kSeqExprCast39() {
    final XQuery query = new XQuery(
      "('1' cast as xs:boolean) cast as xs:string eq 'true'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC offset to xs:gYear..
   */
  @org.junit.Test
  public void kSeqExprCast390() {
    final XQuery query = new XQuery(
      "xs:gYear(xs:date(\"2002-11-23-13:37\")) eq xs:gYear(\"2002-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC timezone to xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast391() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(xs:date(\"2002-11-23Z\")) eq xs:gYearMonth(\"2002-11Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC offset to xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast392() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(xs:date(\"2002-11-23-13:37\")) eq xs:gYearMonth(\"2002-11-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC timezone to xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast393() {
    final XQuery query = new XQuery(
      "xs:gMonth(xs:date(\"2002-11-23-00:00\")) eq xs:gMonth(\"--11Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC offset to xs:gMonth..
   */
  @org.junit.Test
  public void kSeqExprCast394() {
    final XQuery query = new XQuery(
      "xs:gMonth(xs:date(\"2002-11-23-13:37\")) eq xs:gMonth(\"--11-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC timezone to xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast395() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(xs:date(\"2002-11-23-00:00\")) eq xs:gMonthDay(\"--11-23Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC offset to xs:gMonthDay..
   */
  @org.junit.Test
  public void kSeqExprCast396() {
    final XQuery query = new XQuery(
      "xs:gMonthDay(xs:date(\"2002-11-23-13:37\")) eq xs:gMonthDay(\"--11-23-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC timezone to xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast397() {
    final XQuery query = new XQuery(
      "xs:gDay(xs:date(\"2002-11-23-00:00\")) eq xs:gDay(\"---23Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC offset to xs:gDay..
   */
  @org.junit.Test
  public void kSeqExprCast398() {
    final XQuery query = new XQuery(
      "xs:gDay(xs:date(\"2002-11-23-13:37\")) eq xs:gDay(\"---23-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC timezone to xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast399() {
    final XQuery query = new XQuery(
      "xs:dateTime(xs:date(\"2002-11-23-00:00\")) eq xs:dateTime(\"2002-11-23T00:00:00.000Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'cast as' where the type is invalid..
   */
  @org.junit.Test
  public void kSeqExprCast4() {
    final XQuery query = new XQuery(
      "'string' cast as xs:anySimpleType",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0051")
    );
  }

  /**
   *  A test whose essence is: `xs:boolean('0') cast as xs:string eq 'false'`..
   */
  @org.junit.Test
  public void kSeqExprCast40() {
    final XQuery query = new XQuery(
      "xs:boolean('0') cast as xs:string eq 'false'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test of casting a xs:date with UTC offset to xs:dateTime..
   */
  @org.junit.Test
  public void kSeqExprCast400() {
    final XQuery query = new XQuery(
      "xs:dateTime(xs:date(\"2002-11-23-13:37\")) eq xs:dateTime(\"2002-11-23T00:00:00.000-13:37\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:date to xs:string, with timezone '-00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast401() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"1999-12-01-00:00\")) eq \"1999-12-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure casting xs:date to xs:string, with timezone '+00:00' is properly handled..
   */
  @org.junit.Test
  public void kSeqExprCast402() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"1999-12-01+00:00\")) eq \"1999-12-01Z\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:date to xs:string that an empty milli seconds part is not serialized..
   */
  @org.junit.Test
  public void kSeqExprCast403() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"2002-02-15\")) eq \"2002-02-15\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:date to xs:string that milli seconds have no trailing zeros..
   */
  @org.junit.Test
  public void kSeqExprCast404() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"2002-02-15\")) eq \"2002-02-15\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:date to xs:string that milli seconds are properly padded with zeros..
   */
  @org.junit.Test
  public void kSeqExprCast405() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"2002-02-15\")) eq \"2002-02-15\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:date to xs:string that milli seconds are properly padded with zeros..
   */
  @org.junit.Test
  public void kSeqExprCast406() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"2002-02-15\")) eq \"2002-02-15\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:date to xs:string that a milli seconds part of '435' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast407() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"2002-02-15\")) eq \"2002-02-15\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:date to xs:string that a milli seconds part of '11' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast408() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"2002-02-15\")) eq \"2002-02-15\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Ensure when casting xs:date to xs:string that a milli seconds part of '110' is handled properly..
   */
  @org.junit.Test
  public void kSeqExprCast409() {
    final XQuery query = new XQuery(
      "xs:string(xs:date(\"2002-02-15\")) eq \"2002-02-15\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `" white space left alone" cast as xs:string eq xs:string(" white space left alone")`..
   */
  @org.junit.Test
  public void kSeqExprCast41() {
    final XQuery query = new XQuery(
      "\" white space left alone\" cast as xs:string eq xs:string(\" white space left alone\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  The xs:untypedAtomic constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast411() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:untypedAtomic constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast412() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic( \"an arbitrary string(untypedAtomic source)\" , \"an arbitrary string(untypedAtomic source)\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:untypedAtomic constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast413() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")), 3, 1) instance of xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:untypedAtomic..
   */
  @org.junit.Test
  public void kSeqExprCast414() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\" an arbitrary string(untypedAtomic source) \") eq xs:untypedAtomic(\" an arbitrary string(untypedAtomic source) \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is a valid lexical representation of xs:untypedAtomic..
   */
  @org.junit.Test
  public void kSeqExprCast415() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"\") eq xs:untypedAtomic(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "an arbitrary string(untypedAtomic source)" ..
   */
  @org.junit.Test
  public void kSeqExprCast416() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:untypedAtomic( \"an arbitrary string(untypedAtomic source)\" )) eq xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:untypedAtomic that has the lexical value ' "an arbitrary string(untypedAtomic source)" ' should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast417() {
    final XQuery query = new XQuery(
      "boolean(xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:untypedAtomic to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast418() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\") cast as xs:untypedAtomic eq xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:untypedAtomic as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast419() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `(xs:QName("fn:local-name") cast as xs:string) eq "fn:local-name"`..
   */
  @org.junit.Test
  public void kSeqExprCast42() {
    final XQuery query = new XQuery(
      "(xs:QName(\"fn:local-name\") cast as xs:string) eq \"fn:local-name\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:untypedAtomic to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast420() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:untypedAtomic as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast421() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:untypedAtomic to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast422a() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'castable as' involving xs:untypedAtomic as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast423() {
    final XQuery query = new XQuery(
      "not(xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:untypedAtomic as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast424() {
    final XQuery query = new XQuery(
      "not(xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:string constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast425() {
    final XQuery query = new XQuery(
      "xs:string()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:string constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast426() {
    final XQuery query = new XQuery(
      "xs:string( \"an arbitrary string\" , \"an arbitrary string\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:string constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast427() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:string(\"an arbitrary string\")), 3, 1) instance of xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:string..
   */
  @org.junit.Test
  public void kSeqExprCast428() {
    final XQuery query = new XQuery(
      "xs:string(\" an arbitrary string \") eq xs:string(\" an arbitrary string \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is a valid lexical representation of xs:string..
   */
  @org.junit.Test
  public void kSeqExprCast429() {
    final XQuery query = new XQuery(
      "xs:string(\"\") eq xs:string(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `(xs:QName("local-name") cast as xs:string) eq "local-name"`..
   */
  @org.junit.Test
  public void kSeqExprCast43() {
    final XQuery query = new XQuery(
      "(xs:QName(\"local-name\") cast as xs:string) eq \"local-name\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "an arbitrary string" ..
   */
  @org.junit.Test
  public void kSeqExprCast430() {
    final XQuery query = new XQuery(
      "xs:string(xs:untypedAtomic( \"an arbitrary string\" )) eq xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:string that has the lexical value ' "an arbitrary string" ' should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast431() {
    final XQuery query = new XQuery(
      "boolean(xs:string(\"an arbitrary string\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:string to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast432() {
    final XQuery query = new XQuery(
      "xs:string(\"an arbitrary string\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:string as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast433() {
    final XQuery query = new XQuery(
      "xs:string(\"an arbitrary string\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:string to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast434() {
    final XQuery query = new XQuery(
      "xs:string(\"an arbitrary string\") cast as xs:string eq xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:string as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast435() {
    final XQuery query = new XQuery(
      "xs:string(\"an arbitrary string\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:string as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast436() {
    final XQuery query = new XQuery(
      "not(xs:string(\"an arbitrary string\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:float constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast437() {
    final XQuery query = new XQuery(
      "xs:float()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:float constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast438() {
    final XQuery query = new XQuery(
      "xs:float( \"3.4e5\" , \"3.4e5\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:float constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast439() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:float(\"3.4e5\")), 3, 1) instance of xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:anyURI('example.com/')) eq 'example.com/'`..
   */
  @org.junit.Test
  public void kSeqExprCast44() {
    final XQuery query = new XQuery(
      "xs:string(xs:anyURI('example.com/')) eq 'example.com/'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:float..
   */
  @org.junit.Test
  public void kSeqExprCast440() {
    final XQuery query = new XQuery(
      "xs:float(\" 3.4e5 \") eq xs:float(\" 3.4e5 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:float..
   */
  @org.junit.Test
  public void kSeqExprCast441() {
    final XQuery query = new XQuery(
      "xs:float(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "3.4e5" ..
   */
  @org.junit.Test
  public void kSeqExprCast442() {
    final XQuery query = new XQuery(
      "xs:float(xs:untypedAtomic( \"3.4e5\" )) eq xs:float(\"3.4e5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:float that has the lexical value ' "3.4e5" ' should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast443() {
    final XQuery query = new XQuery(
      "boolean(xs:float(\"3.4e5\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast444() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast445() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast446() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast447() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:float is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast448() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:float eq xs:float(\"3.4e5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:float as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast449() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") castable as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:double(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast45() {
    final XQuery query = new XQuery(
      "xs:string(xs:double(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:double is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast450() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:double ne xs:double(\"3.3e3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:double as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast451() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") castable as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast452() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast453() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast454() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast455() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast456() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast457() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast458() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast459() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:string(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast46() {
    final XQuery query = new XQuery(
      "xs:string(xs:string(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast460() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast461() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast462() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast463() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast464() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast465() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast466() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast467() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast468() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast469() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:integer(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast47() {
    final XQuery query = new XQuery(
      "xs:string(xs:integer(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast470() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast471() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast472() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast473() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:boolean is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast474() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:boolean eq xs:boolean(\"true\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:boolean as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast475() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") castable as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast476() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast477() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast478() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast479() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:decimal(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast48() {
    final XQuery query = new XQuery(
      "xs:string(xs:decimal(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast480() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast481() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:float to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast482() {
    final XQuery query = new XQuery(
      "xs:float(\"3.4e5\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:float as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast483() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:float as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast484() {
    final XQuery query = new XQuery(
      "not(xs:float(\"3.4e5\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:double constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast485() {
    final XQuery query = new XQuery(
      "xs:double()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:double constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast486() {
    final XQuery query = new XQuery(
      "xs:double( \"3.3e3\" , \"3.3e3\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:double constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast487() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:double(\"3.3e3\")), 3, 1) instance of xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:double..
   */
  @org.junit.Test
  public void kSeqExprCast488() {
    final XQuery query = new XQuery(
      "xs:double(\" 3.3e3 \") eq xs:double(\" 3.3e3 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:double..
   */
  @org.junit.Test
  public void kSeqExprCast489() {
    final XQuery query = new XQuery(
      "xs:double(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `"untyped a " cast as xs:untypedAtomic eq xs:untypedAtomic("untyped a ")`..
   */
  @org.junit.Test
  public void kSeqExprCast49() {
    final XQuery query = new XQuery(
      "\"untyped a \" cast as xs:untypedAtomic eq xs:untypedAtomic(\"untyped a \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "3.3e3" ..
   */
  @org.junit.Test
  public void kSeqExprCast490() {
    final XQuery query = new XQuery(
      "xs:double(xs:untypedAtomic( \"3.3e3\" )) eq xs:double(\"3.3e3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:double that has the lexical value ' "3.3e3" ' should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast491() {
    final XQuery query = new XQuery(
      "boolean(xs:double(\"3.3e3\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast492() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast493() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast494() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast495() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:float is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast496() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:float ne xs:float(\"3.4e5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:float as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast497() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") castable as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:double is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast498() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:double eq xs:double(\"3.3e3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:double as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast499() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") castable as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'cast as' where the type is invalid..
   */
  @org.junit.Test
  public void kSeqExprCast5() {
    final XQuery query = new XQuery(
      "'string' cast as xs:untyped",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0051")
    );
  }

  /**
   *  A test whose essence is: `false() cast as xs:untypedAtomic eq xs:untypedAtomic("false")`..
   */
  @org.junit.Test
  public void kSeqExprCast50() {
    final XQuery query = new XQuery(
      "false() cast as xs:untypedAtomic eq xs:untypedAtomic(\"false\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast500() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast501() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast502() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast503() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast504() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast505() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast506() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast507() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast508() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast509() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `true() cast as xs:untypedAtomic eq xs:untypedAtomic("true")`..
   */
  @org.junit.Test
  public void kSeqExprCast51() {
    final XQuery query = new XQuery(
      "true() cast as xs:untypedAtomic eq xs:untypedAtomic(\"true\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast510() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast511() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast512() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast513() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast514() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast515() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast516() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast517() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast518() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast519() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `false() cast as xs:untypedAtomic instance of xs:untypedAtomic`..
   */
  @org.junit.Test
  public void kSeqExprCast52() {
    final XQuery query = new XQuery(
      "false() cast as xs:untypedAtomic instance of xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast520() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast521() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:boolean is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast522() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:boolean eq xs:boolean(\"true\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:boolean as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast523() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") castable as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast524() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast525() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast526() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast527() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast528() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast529() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `true() cast as xs:untypedAtomic instance of xs:untypedAtomic`..
   */
  @org.junit.Test
  public void kSeqExprCast53() {
    final XQuery query = new XQuery(
      "true() cast as xs:untypedAtomic instance of xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:double to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast530() {
    final XQuery query = new XQuery(
      "xs:double(\"3.3e3\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:double as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast531() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:double as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast532() {
    final XQuery query = new XQuery(
      "not(xs:double(\"3.3e3\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:decimal constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast533() {
    final XQuery query = new XQuery(
      "xs:decimal()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:decimal constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast534() {
    final XQuery query = new XQuery(
      "xs:decimal( \"10.01\" , \"10.01\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:decimal constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast535() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:decimal(\"10.01\")), 3, 1) instance of xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:decimal..
   */
  @org.junit.Test
  public void kSeqExprCast536() {
    final XQuery query = new XQuery(
      "xs:decimal(\" 10.01 \") eq xs:decimal(\" 10.01 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:decimal..
   */
  @org.junit.Test
  public void kSeqExprCast537() {
    final XQuery query = new XQuery(
      "xs:decimal(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "10.01" ..
   */
  @org.junit.Test
  public void kSeqExprCast538() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:untypedAtomic( \"10.01\" )) eq xs:decimal(\"10.01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:decimal that has the lexical value ' "10.01" ' should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast539() {
    final XQuery query = new XQuery(
      "boolean(xs:decimal(\"10.01\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `(xs:QName("local-name") cast as xs:untypedAtomic) eq xs:untypedAtomic("local-name")`..
   */
  @org.junit.Test
  public void kSeqExprCast54() {
    final XQuery query = new XQuery(
      "(xs:QName(\"local-name\") cast as xs:untypedAtomic) eq xs:untypedAtomic(\"local-name\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast540() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast541() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast542() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast543() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:float is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast544() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:float ne xs:float(\"3.4e5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:float as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast545() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") castable as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:double is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast546() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:double ne xs:double(\"3.3e3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:double as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast547() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") castable as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:decimal is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast548() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:decimal eq xs:decimal(\"10.01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:decimal as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast549() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") castable as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `(xs:QName("fn:local-name") cast as xs:untypedAtomic) eq xs:untypedAtomic("fn:local-name")`..
   */
  @org.junit.Test
  public void kSeqExprCast55() {
    final XQuery query = new XQuery(
      "(xs:QName(\"fn:local-name\") cast as xs:untypedAtomic) eq xs:untypedAtomic(\"fn:local-name\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:integer is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast550() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:integer ne xs:integer(\"6789\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:integer as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast551() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") castable as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast552() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast553() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast554() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast555() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast556() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast557() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast558() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast559() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:untypedAtomic(xs:anyURI('example.com/')) eq 'example.com/'`..
   */
  @org.junit.Test
  public void kSeqExprCast56() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:anyURI('example.com/')) eq 'example.com/'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast560() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast561() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast562() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast563() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast564() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast565() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast566() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast567() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast568() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast569() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:untypedAtomic(xs:double(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast57() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:double(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast570() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast571() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast572() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast573() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:boolean is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast574() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:boolean eq xs:boolean(\"true\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:boolean as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast575() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") castable as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast576() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast577() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast578() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast579() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:untypedAtomic(xs:string(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast58() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:string(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast580() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast581() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:decimal to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast582() {
    final XQuery query = new XQuery(
      "xs:decimal(\"10.01\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:decimal as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast583() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:decimal as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast584() {
    final XQuery query = new XQuery(
      "not(xs:decimal(\"10.01\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:integer constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast585() {
    final XQuery query = new XQuery(
      "xs:integer()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:integer constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast586() {
    final XQuery query = new XQuery(
      "xs:integer( \"6789\" , \"6789\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:integer constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast587() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:integer(\"6789\")), 3, 1) instance of xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:integer..
   */
  @org.junit.Test
  public void kSeqExprCast588() {
    final XQuery query = new XQuery(
      "xs:integer(\" 6789 \") eq xs:integer(\" 6789 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:integer..
   */
  @org.junit.Test
  public void kSeqExprCast589() {
    final XQuery query = new XQuery(
      "xs:integer(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:untypedAtomic(xs:integer(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast59() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:integer(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "6789" ..
   */
  @org.junit.Test
  public void kSeqExprCast590() {
    final XQuery query = new XQuery(
      "xs:integer(xs:untypedAtomic( \"6789\" )) eq xs:integer(\"6789\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Applying fn:boolean() to a value of type xs:integer that has the lexical value ' "6789" ' should result in the boolean value true..
   */
  @org.junit.Test
  public void kSeqExprCast591() {
    final XQuery query = new XQuery(
      "boolean(xs:integer(\"6789\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast592() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast593() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast594() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast595() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:float is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast596() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:float ne xs:float(\"3.4e5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:float as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast597() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") castable as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:double is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast598() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:double ne xs:double(\"3.3e3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:double as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast599() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") castable as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'cast as' where the type is invalid..
   */
  @org.junit.Test
  public void kSeqExprCast6() {
    final XQuery query = new XQuery(
      "'string' cast as xs:anyAtomicType",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  A test whose essence is: `xs:untypedAtomic(xs:decimal(3)) eq '3'`..
   */
  @org.junit.Test
  public void kSeqExprCast60() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:decimal(3)) eq '3'",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:decimal is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast600() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:decimal ne xs:decimal(\"10.01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:decimal as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast601() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") castable as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:integer is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast602() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:integer eq xs:integer(\"6789\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:integer as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast603() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") castable as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast604() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast605() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast606() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast607() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast608() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast609() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting to xs:notation is not allowed..
   */
  @org.junit.Test
  public void kSeqExprCast61() {
    final XQuery query = new XQuery(
      "\"notation is abstract\" cast as xs:NOTATION",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  Casting from xs:integer to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast610() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast611() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast612() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast613() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast614() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast615() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast616() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast617() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast618() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast619() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting to xs:notation is not allowed..
   */
  @org.junit.Test
  public void kSeqExprCast62() {
    final XQuery query = new XQuery(
      "\"notation is abstract\" cast as xs:NOTATION?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  Casting from xs:integer to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast620() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast621() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast622() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast623() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast624() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast625() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:boolean is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast626() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:boolean eq xs:boolean(\"true\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:boolean as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast627() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") castable as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast628() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast629() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting to xs:notation is not allowed..
   */
  @org.junit.Test
  public void kSeqExprCast63() {
    final XQuery query = new XQuery(
      "() cast as xs:NOTATION?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0080")
      ||
        error("XPST0005")
      )
    );
  }

  /**
   *  Casting from xs:integer to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast630() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast631() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast632() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast633() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:integer to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast634() {
    final XQuery query = new XQuery(
      "xs:integer(\"6789\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:integer as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast635() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:integer as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast636() {
    final XQuery query = new XQuery(
      "not(xs:integer(\"6789\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:duration constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast637() {
    final XQuery query = new XQuery(
      "xs:duration()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:duration constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast638() {
    final XQuery query = new XQuery(
      "xs:duration( \"P1Y2M3DT10H30M\" , \"P1Y2M3DT10H30M\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:duration constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast639() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:duration(\"P1Y2M3DT10H30M\")), 3, 1) instance of xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting to xs:notation is not allowed..
   */
  @org.junit.Test
  public void kSeqExprCast64() {
    final XQuery query = new XQuery(
      "() cast as xs:NOTATION",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPST0080")
      ||
        error("XPST0005")
      ||
        error("XPTY0004")
      )
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast640() {
    final XQuery query = new XQuery(
      "xs:duration(\" P1Y2M3DT10H30M \") eq xs:duration(\" P1Y2M3DT10H30M \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:duration..
   */
  @org.junit.Test
  public void kSeqExprCast641() {
    final XQuery query = new XQuery(
      "xs:duration(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "P1Y2M3DT10H30M" ..
   */
  @org.junit.Test
  public void kSeqExprCast642() {
    final XQuery query = new XQuery(
      "xs:duration(xs:untypedAtomic( \"P1Y2M3DT10H30M\" )) eq xs:duration(\"P1Y2M3DT10H30M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:duration, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast643() {
    final XQuery query = new XQuery(
      "boolean(xs:duration(\"P1Y2M3DT10H30M\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:duration to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast644() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast645() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast646() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast647() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast648() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast649() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting to xs:notation is not allowed..
   */
  @org.junit.Test
  public void kSeqExprCast65() {
    final XQuery query = new XQuery(
      "xs:NOTATION(xs:anyURI('example.com/'))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Casting from xs:duration to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast650() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast651() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast652() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast653() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast654() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast655() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:duration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast656() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:duration eq xs:duration(\"P1Y2M3DT10H30M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:duration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast657() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") castable as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:yearMonthDuration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast658() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:yearMonthDuration ne xs:yearMonthDuration(\"P1Y12M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:yearMonthDuration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast659() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") castable as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting to xs:notation is not allowed..
   */
  @org.junit.Test
  public void kSeqExprCast66() {
    final XQuery query = new XQuery(
      "xs:NOTATION(QName('example.com', 'p:foo'))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Casting from xs:duration to xs:dayTimeDuration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast660() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:dayTimeDuration ne xs:dayTimeDuration(\"P3DT2H\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:dayTimeDuration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast661() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") castable as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast662() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast663() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast664() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast665() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast666() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast667() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast668() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast669() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting to xs:QName where the cardinality is wrong..
   */
  @org.junit.Test
  public void kSeqExprCast67() {
    final XQuery query = new XQuery(
      "() cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("XPST0005")
      )
    );
  }

  /**
   *  Casting from xs:duration to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast670() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast671() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast672() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast673() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast674() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast675() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast676() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast677() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast678() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast679() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Input when casting to xs:QName must be a string literal..
   */
  @org.junit.Test
  public void kSeqExprCast68() {
    final XQuery query = new XQuery(
      "3 cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  Casting from xs:duration to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast680() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast681() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast682() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast683() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast684() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast685() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:duration to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast686() {
    final XQuery query = new XQuery(
      "xs:duration(\"P1Y2M3DT10H30M\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:duration as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast687() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:duration as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast688() {
    final XQuery query = new XQuery(
      "not(xs:duration(\"P1Y2M3DT10H30M\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:yearMonthDuration constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast689() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Input when casting to xs:QName must be a string literal..
   */
  @org.junit.Test
  public void kSeqExprCast69() {
    final XQuery query = new XQuery(
      ". cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("XPTY0004")
      ||
        error("XPDY0002")
      )
    );
  }

  /**
   *  The xs:yearMonthDuration constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast690() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration( \"P1Y12M\" , \"P1Y12M\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:yearMonthDuration constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast691() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:yearMonthDuration(\"P1Y12M\")), 3, 1) instance of xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast692() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\" P1Y12M \") eq xs:yearMonthDuration(\" P1Y12M \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:yearMonthDuration..
   */
  @org.junit.Test
  public void kSeqExprCast693() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "P1Y12M" ..
   */
  @org.junit.Test
  public void kSeqExprCast694() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(xs:untypedAtomic( \"P1Y12M\" )) eq xs:yearMonthDuration(\"P1Y12M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:yearMonthDuration, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast695() {
    final XQuery query = new XQuery(
      "boolean(xs:yearMonthDuration(\"P1Y12M\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast696() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast697() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast698() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast699() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'cast as' where the type is invalid..
   */
  @org.junit.Test
  public void kSeqExprCast7() {
    final XQuery query = new XQuery(
      "'string' cast as xs:anyType",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0051")
    );
  }

  /**
   *  Casting a xs:QName value to xs:QName is possible..
   */
  @org.junit.Test
  public void kSeqExprCast70() {
    final XQuery query = new XQuery(
      "(xs:QName(\"local-name\") cast as xs:QName) eq xs:QName(\"local-name\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast700() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast701() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast702() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast703() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast704() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast705() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast706() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast707() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:duration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast708() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:duration ne xs:duration(\"P1Y2M3DT10H30M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:duration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast709() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") castable as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting xs:untypedAtomic to xs:QName is an error..
   */
  @org.junit.Test
  public void kSeqExprCast71() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"ncname\") cast as xs:QName?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertStringValue(false, "ncname")
      ||
        error("XPTY0004")
      )
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:yearMonthDuration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast710() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:yearMonthDuration eq xs:yearMonthDuration(\"P1Y12M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:yearMonthDuration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast711() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") castable as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:dayTimeDuration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast712() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:dayTimeDuration ne xs:dayTimeDuration(\"P3DT2H\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:dayTimeDuration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast713() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") castable as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast714() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast715() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast716() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast717() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast718() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast719() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `"example.com/" cast as xs:anyURI eq xs:anyURI('example.com/')`..
   */
  @org.junit.Test
  public void kSeqExprCast72() {
    final XQuery query = new XQuery(
      "\"example.com/\" cast as xs:anyURI eq xs:anyURI('example.com/')",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast720() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast721() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast722() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast723() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast724() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast725() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast726() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast727() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast728() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast729() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:untypedAtomic("example.com/") cast as xs:anyURI eq xs:anyURI('example.com/')`..
   */
  @org.junit.Test
  public void kSeqExprCast73() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"example.com/\") cast as xs:anyURI eq xs:anyURI('example.com/')",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast730() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast731() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast732() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast733() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast734() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast735() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast736() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast737() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:yearMonthDuration to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast738() {
    final XQuery query = new XQuery(
      "xs:yearMonthDuration(\"P1Y12M\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast739() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:anyURI("example.com/") cast as xs:anyURI eq xs:anyURI('example.com/')`..
   */
  @org.junit.Test
  public void kSeqExprCast74() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"example.com/\") cast as xs:anyURI eq xs:anyURI('example.com/')",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:yearMonthDuration as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast740() {
    final XQuery query = new XQuery(
      "not(xs:yearMonthDuration(\"P1Y12M\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:dayTimeDuration constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast741() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:dayTimeDuration constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast742() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration( \"P3DT2H\" , \"P3DT2H\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:dayTimeDuration constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast743() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:dayTimeDuration(\"P3DT2H\")), 3, 1) instance of xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast744() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\" P3DT2H \") eq xs:dayTimeDuration(\" P3DT2H \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:dayTimeDuration..
   */
  @org.junit.Test
  public void kSeqExprCast745() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "P3DT2H" ..
   */
  @org.junit.Test
  public void kSeqExprCast746() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(xs:untypedAtomic( \"P3DT2H\" )) eq xs:dayTimeDuration(\"P3DT2H\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:dayTimeDuration, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast747() {
    final XQuery query = new XQuery(
      "boolean(xs:dayTimeDuration(\"P3DT2H\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast748() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast749() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:double(3) eq 3`..
   */
  @org.junit.Test
  public void kSeqExprCast75() {
    final XQuery query = new XQuery(
      "xs:double(3) eq 3",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast750() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast751() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast752() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast753() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast754() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast755() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast756() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast757() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast758() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast759() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:double(3.1) eq 3.1`..
   */
  @org.junit.Test
  public void kSeqExprCast76() {
    final XQuery query = new XQuery(
      "xs:double(3.1) eq 3.1",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:duration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast760() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:duration ne xs:duration(\"P1Y2M3DT10H30M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:duration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast761() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") castable as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:yearMonthDuration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast762() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:yearMonthDuration ne xs:yearMonthDuration(\"P1Y12M\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:yearMonthDuration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast763() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") castable as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:dayTimeDuration is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast764() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:dayTimeDuration eq xs:dayTimeDuration(\"P3DT2H\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:dayTimeDuration as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast765() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") castable as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast766() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast767() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast768() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast769() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:double(6) instance of xs:double`..
   */
  @org.junit.Test
  public void kSeqExprCast77() {
    final XQuery query = new XQuery(
      "xs:double(6) instance of xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast770() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast771() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast772() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast773() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast774() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast775() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast776() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast777() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast778() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast779() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:double("INF")) eq "INF"`..
   */
  @org.junit.Test
  public void kSeqExprCast78() {
    final XQuery query = new XQuery(
      "xs:string(xs:double(\"INF\")) eq \"INF\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast780() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast781() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast782() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast783() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast784() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast785() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast786() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast787() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast788() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast789() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:double("-INF")) eq "-INF"`..
   */
  @org.junit.Test
  public void kSeqExprCast79() {
    final XQuery query = new XQuery(
      "xs:string(xs:double(\"-INF\")) eq \"-INF\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dayTimeDuration to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast790() {
    final XQuery query = new XQuery(
      "xs:dayTimeDuration(\"P3DT2H\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast791() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dayTimeDuration as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast792() {
    final XQuery query = new XQuery(
      "not(xs:dayTimeDuration(\"P3DT2H\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:dateTime constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast793() {
    final XQuery query = new XQuery(
      "xs:dateTime()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:dateTime constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast794() {
    final XQuery query = new XQuery(
      "xs:dateTime( \"2002-10-10T12:00:00-05:00\" , \"2002-10-10T12:00:00-05:00\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:dateTime constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast795() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:dateTime(\"2002-10-10T12:00:00-05:00\")), 3, 1) instance of xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:dateTime..
   */
  @org.junit.Test
  public void kSeqExprCast796() {
    final XQuery query = new XQuery(
      "xs:dateTime(\" 2002-10-10T12:00:00-05:00 \") eq xs:dateTime(\" 2002-10-10T12:00:00-05:00 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:dateTime..
   */
  @org.junit.Test
  public void kSeqExprCast797() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "2002-10-10T12:00:00-05:00" ..
   */
  @org.junit.Test
  public void kSeqExprCast798() {
    final XQuery query = new XQuery(
      "xs:dateTime(xs:untypedAtomic( \"2002-10-10T12:00:00-05:00\" )) eq xs:dateTime(\"2002-10-10T12:00:00-05:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:dateTime, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast799() {
    final XQuery query = new XQuery(
      "boolean(xs:dateTime(\"2002-10-10T12:00:00-05:00\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  A prefix is used which isn't declared..
   */
  @org.junit.Test
  public void kSeqExprCast8() {
    final XQuery query = new XQuery(
      "3 cast as prefixDoesNotExist:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0081")
    );
  }

  /**
   *  A test whose essence is: `xs:float(3) eq 3`..
   */
  @org.junit.Test
  public void kSeqExprCast80() {
    final XQuery query = new XQuery(
      "xs:float(3) eq 3",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast800() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast801() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast802() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast803() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast804() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast805() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast806() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast807() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast808() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast809() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:float(3.1) eq 3.1`..
   */
  @org.junit.Test
  public void kSeqExprCast81() {
    final XQuery query = new XQuery(
      "xs:float(3.1) eq 3.1",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast810() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast811() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast812() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast813() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast814() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast815() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast816() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast817() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:dateTime is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast818() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:dateTime eq xs:dateTime(\"2002-10-10T12:00:00-05:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:dateTime as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast819() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:float(6) instance of xs:float`..
   */
  @org.junit.Test
  public void kSeqExprCast82() {
    final XQuery query = new XQuery(
      "xs:float(6) instance of xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:time is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast820() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:time ne xs:time(\"03:20:00-05:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:time as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast821() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:date is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast822() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:date ne xs:date(\"2004-10-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:date as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast823() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:gYearMonth is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast824() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:gYearMonth ne xs:gYearMonth(\"1999-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:gYearMonth as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast825() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:gYear is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast826() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:gYear ne xs:gYear(\"1999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:gYear as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast827() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:gMonthDay is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast828() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:gMonthDay ne xs:gMonthDay(\"--11-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:gMonthDay as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast829() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:float("INF")) eq "INF"`..
   */
  @org.junit.Test
  public void kSeqExprCast83() {
    final XQuery query = new XQuery(
      "xs:string(xs:float(\"INF\")) eq \"INF\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:gDay is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast830() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:gDay ne xs:gDay(\"---03\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:gDay as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast831() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:gMonth is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast832() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:gMonth ne xs:gMonth(\"--11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:gMonth as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast833() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast834() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast835() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast836() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast837() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast838() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast839() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:string(xs:float("-INF")) eq "-INF"`..
   */
  @org.junit.Test
  public void kSeqExprCast84() {
    final XQuery query = new XQuery(
      "xs:string(xs:float(\"-INF\")) eq \"-INF\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast840() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast841() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:dateTime to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast842() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-10-10T12:00:00-05:00\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:dateTime as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast843() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:dateTime as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast844() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2002-10-10T12:00:00-05:00\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:time constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast845() {
    final XQuery query = new XQuery(
      "xs:time()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:time constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast846() {
    final XQuery query = new XQuery(
      "xs:time( \"03:20:00-05:00\" , \"03:20:00-05:00\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:time constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast847() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:time(\"03:20:00-05:00\")), 3, 1) instance of xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast848() {
    final XQuery query = new XQuery(
      "xs:time(\" 03:20:00-05:00 \") eq xs:time(\" 03:20:00-05:00 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:time..
   */
  @org.junit.Test
  public void kSeqExprCast849() {
    final XQuery query = new XQuery(
      "xs:time(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  A test whose essence is: `xs:decimal(3) eq 3`..
   */
  @org.junit.Test
  public void kSeqExprCast85() {
    final XQuery query = new XQuery(
      "xs:decimal(3) eq 3",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "03:20:00-05:00" ..
   */
  @org.junit.Test
  public void kSeqExprCast850() {
    final XQuery query = new XQuery(
      "xs:time(xs:untypedAtomic( \"03:20:00-05:00\" )) eq xs:time(\"03:20:00-05:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:time, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast851() {
    final XQuery query = new XQuery(
      "boolean(xs:time(\"03:20:00-05:00\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:time to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast852() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast853() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast854() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast855() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast856() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast857() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast858() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast859() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:decimal(3.1) eq 3.1`..
   */
  @org.junit.Test
  public void kSeqExprCast86() {
    final XQuery query = new XQuery(
      "xs:decimal(3.1) eq 3.1",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast860() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast861() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast862() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast863() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast864() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast865() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast866() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast867() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast868() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast869() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:decimal(6) instance of xs:decimal`..
   */
  @org.junit.Test
  public void kSeqExprCast87() {
    final XQuery query = new XQuery(
      "xs:decimal(6) instance of xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast870() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast871() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:time is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast872() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:time eq xs:time(\"03:20:00-05:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:time as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast873() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") castable as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast874() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast875() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:gYearMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast876() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:gYearMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast877() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:gYearMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast878() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast879() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:integer(3) eq 3`..
   */
  @org.junit.Test
  public void kSeqExprCast88() {
    final XQuery query = new XQuery(
      "xs:integer(3) eq 3",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast880() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast881() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast882() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast883() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast884() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast885() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast886() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast887() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast888() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast889() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:integer(3.1) eq 3`..
   */
  @org.junit.Test
  public void kSeqExprCast89() {
    final XQuery query = new XQuery(
      "xs:integer(3.1) eq 3",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast890() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast891() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast892() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast893() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:time to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast894() {
    final XQuery query = new XQuery(
      "xs:time(\"03:20:00-05:00\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:time as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast895() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:time as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast896() {
    final XQuery query = new XQuery(
      "not(xs:time(\"03:20:00-05:00\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:date constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast897() {
    final XQuery query = new XQuery(
      "xs:date()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  The xs:date constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast898() {
    final XQuery query = new XQuery(
      "xs:date( \"2004-10-13\" , \"2004-10-13\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:date constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast899() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:date(\"2004-10-13\")), 3, 1) instance of xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A type is specified which doesn't exist..
   */
  @org.junit.Test
  public void kSeqExprCast9() {
    final XQuery query = new XQuery(
      "3 cast as xs:doesNotExist",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0051")
    );
  }

  /**
   *  Test that when casting xs:decimal to xs:integer that conversion happens..
   */
  @org.junit.Test
  public void kSeqExprCast90() {
    final XQuery query = new XQuery(
      "xs:integer(3.1) eq 3",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast900() {
    final XQuery query = new XQuery(
      "xs:date(\" 2004-10-13 \") eq xs:date(\" 2004-10-13 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:date..
   */
  @org.junit.Test
  public void kSeqExprCast901() {
    final XQuery query = new XQuery(
      "xs:date(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "2004-10-13" ..
   */
  @org.junit.Test
  public void kSeqExprCast902() {
    final XQuery query = new XQuery(
      "xs:date(xs:untypedAtomic( \"2004-10-13\" )) eq xs:date(\"2004-10-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:date, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast903() {
    final XQuery query = new XQuery(
      "boolean(xs:date(\"2004-10-13\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:date to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast904() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast905() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast906() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast907() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast908() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast909() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:integer(6) instance of xs:integer`..
   */
  @org.junit.Test
  public void kSeqExprCast91() {
    final XQuery query = new XQuery(
      "xs:integer(6) instance of xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast910() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast911() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast912() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast913() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast914() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast915() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast916() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast917() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast918() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast919() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:integer(6) instance of xs:decimal`..
   */
  @org.junit.Test
  public void kSeqExprCast92() {
    final XQuery query = new XQuery(
      "xs:integer(6) instance of xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast920() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast921() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:dateTime is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast922() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:dateTime ne xs:dateTime(\"2002-10-10T12:00:00-05:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:dateTime as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast923() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast924() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast925() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:date is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast926() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:date eq xs:date(\"2004-10-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:date as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast927() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:gYearMonth is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast928() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:gYearMonth ne xs:gYearMonth(\"1999-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:gYearMonth as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast929() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:hexBinary("FFF")`..
   */
  @org.junit.Test
  public void kSeqExprCast93() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"FFF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:date to xs:gYear is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast930() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:gYear ne xs:gYear(\"1999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:gYear as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast931() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:gMonthDay is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast932() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:gMonthDay ne xs:gMonthDay(\"--11-13\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:gMonthDay as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast933() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:gDay is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast934() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:gDay ne xs:gDay(\"---03\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:gDay as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast935() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:gMonth is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast936() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:gMonth ne xs:gMonth(\"--11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:gMonth as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast937() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") castable as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast938() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast939() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:hexBinary("FFxF")`..
   */
  @org.junit.Test
  public void kSeqExprCast94() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"FFxF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:date to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast940() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast941() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast942() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast943() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast944() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast945() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:date to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast946() {
    final XQuery query = new XQuery(
      "xs:date(\"2004-10-13\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:date as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast947() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:date as sourceType and xs:NOTATION should fail due to it involving xs:NOTATION..
   */
  @org.junit.Test
  public void kSeqExprCast948() {
    final XQuery query = new XQuery(
      "not(xs:date(\"2004-10-13\") castable as xs:NOTATION)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  The xs:gYearMonth constructor function must be passed exactly one argument, not zero..
   */
  @org.junit.Test
  public void kSeqExprCast949() {
    final XQuery query = new XQuery(
      "xs:gYearMonth()",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  A test whose essence is: `xs:hexBinary("0xFF")`..
   */
  @org.junit.Test
  public void kSeqExprCast95() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"0xFF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The xs:gYearMonth constructor function must be passed exactly one argument, not two..
   */
  @org.junit.Test
  public void kSeqExprCast950() {
    final XQuery query = new XQuery(
      "xs:gYearMonth( \"1999-11\" , \"1999-11\" )",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Verify with 'instance of' that the xs:gYearMonth constructor function produces values of the correct type. 
   *       The subsequence() function makes it more difficult for optimizers to take short cuts based on static type information..
   */
  @org.junit.Test
  public void kSeqExprCast951() {
    final XQuery query = new XQuery(
      "subsequence((\"dummy\", 1.1, xs:gYearMonth(\"1999-11\")), 3, 1) instance of xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A simple test exercising the whitespace facet for type xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast952() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\" 1999-11 \") eq xs:gYearMonth(\" 1999-11 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  An empty string is not a valid lexical representation of xs:gYearMonth..
   */
  @org.junit.Test
  public void kSeqExprCast953() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a simple xs:untypedAtomic value to "1999-11" ..
   */
  @org.junit.Test
  public void kSeqExprCast954() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(xs:untypedAtomic( \"1999-11\" )) eq xs:gYearMonth(\"1999-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  It is not possible to extract an Effective Boolean Value from the type xs:gYearMonth, with the boolean() function..
   */
  @org.junit.Test
  public void kSeqExprCast955() {
    final XQuery query = new XQuery(
      "boolean(xs:gYearMonth(\"1999-11\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0006")
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:untypedAtomic is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast956() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:untypedAtomic ne xs:untypedAtomic(\"an arbitrary string(untypedAtomic source)\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:untypedAtomic as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast957() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") castable as xs:untypedAtomic",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:string is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast958() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:string ne xs:string(\"an arbitrary string\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:string as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast959() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") castable as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:hexBinary("F")`..
   */
  @org.junit.Test
  public void kSeqExprCast96() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"F\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:float isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast960() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:float as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast961() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:float)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:double isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast962() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:double as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast963() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:double)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:decimal isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast964() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:decimal as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast965() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:decimal)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:integer isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast966() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:integer as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast967() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:integer)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:duration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast968() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:duration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:duration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast969() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:duration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `xs:hexBinary("x")`..
   */
  @org.junit.Test
  public void kSeqExprCast97() {
    final XQuery query = new XQuery(
      "xs:hexBinary(\"x\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:yearMonthDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast970() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:yearMonthDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:yearMonthDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast971() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:yearMonthDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:dayTimeDuration isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast972() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:dayTimeDuration",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:dayTimeDuration as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast973() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:dayTimeDuration)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:dateTime isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast974() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:dateTime as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast975() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:dateTime)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:time isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast976() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:time as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast977() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:time)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:date isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast978() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:date as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast979() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:date)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `exists(xs:hexBinary("Ab08bcFFAA08b6"))`..
   */
  @org.junit.Test
  public void kSeqExprCast98() {
    final XQuery query = new XQuery(
      "exists(xs:hexBinary(\"Ab08bcFFAA08b6\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:gYearMonth is allowed and should always succeed..
   */
  @org.junit.Test
  public void kSeqExprCast980() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:gYearMonth eq xs:gYearMonth(\"1999-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:gYearMonth as target type should always evaluate to true..
   */
  @org.junit.Test
  public void kSeqExprCast981() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") castable as xs:gYearMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:gYear isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast982() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:gYear",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:gYear as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast983() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:gYear)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:gMonthDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast984() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:gMonthDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:gMonthDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast985() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:gMonthDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:gDay isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast986() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:gDay",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:gDay as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast987() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:gDay)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:gMonth isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast988() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:gMonth",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:gMonth as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast989() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:gMonth)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  A test whose essence is: `exists(xs:hexBinary("FF"))`..
   */
  @org.junit.Test
  public void kSeqExprCast99() {
    final XQuery query = new XQuery(
      "exists(xs:hexBinary(\"FF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:boolean isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast990() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:boolean as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast991() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:boolean)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:base64Binary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast992() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:base64Binary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:base64Binary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast993() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:base64Binary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:hexBinary isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast994() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:hexBinary",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:hexBinary as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast995() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:hexBinary)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:anyURI isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast996() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:anyURI",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:anyURI as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast997() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:anyURI)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Casting from xs:gYearMonth to xs:QName isn't allowed..
   */
  @org.junit.Test
  public void kSeqExprCast998() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"1999-11\") cast as xs:QName",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   *  'castable as' involving xs:gYearMonth as source type and xs:QName as target type should always evaluate to false..
   */
  @org.junit.Test
  public void kSeqExprCast999() {
    final XQuery query = new XQuery(
      "not(xs:gYearMonth(\"1999-11\") castable as xs:QName)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Cast to xs:QName where the prefix is declared in the prolog..
   */
  @org.junit.Test
  public void k2SeqExprCast1() {
    final XQuery query = new XQuery(
      "\"myPrefix:ncname\" cast as xs:QName eq QName(\"http://example.com/\", \"anotherPrefix:ncname\")",
      ctx);
    query.namespace("myPrefix", "http://example.com/");

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast10() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Pass an empty string to nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast100() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast101() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast102() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast103() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast104() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast105() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast106() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"-3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast107() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"-3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in long..
   */
  @org.junit.Test
  public void k2SeqExprCast108() {
    final XQuery query = new XQuery(
      "xs:long(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in int..
   */
  @org.junit.Test
  public void k2SeqExprCast109() {
    final XQuery query = new XQuery(
      "xs:int(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast11() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Fractions are disallowed in short..
   */
  @org.junit.Test
  public void k2SeqExprCast110() {
    final XQuery query = new XQuery(
      "xs:short(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in byte..
   */
  @org.junit.Test
  public void k2SeqExprCast111() {
    final XQuery query = new XQuery(
      "xs:byte(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast112() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast113() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast114() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast115() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast116() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Fractions are disallowed in positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast117() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"3.0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast118() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"- 0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for nonPositiveInteger(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast119() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"+ 0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast12() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast120() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"- 3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for long..
   */
  @org.junit.Test
  public void k2SeqExprCast121() {
    final XQuery query = new XQuery(
      "xs:long(\"+ 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for int..
   */
  @org.junit.Test
  public void k2SeqExprCast122() {
    final XQuery query = new XQuery(
      "xs:int(\"+ 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for short..
   */
  @org.junit.Test
  public void k2SeqExprCast123() {
    final XQuery query = new XQuery(
      "xs:short(\"+ 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for byte..
   */
  @org.junit.Test
  public void k2SeqExprCast124() {
    final XQuery query = new XQuery(
      "xs:byte(\"+ 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for long..
   */
  @org.junit.Test
  public void k2SeqExprCast125() {
    final XQuery query = new XQuery(
      "xs:long(\"- 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for int..
   */
  @org.junit.Test
  public void k2SeqExprCast126() {
    final XQuery query = new XQuery(
      "xs:int(\"- 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for short..
   */
  @org.junit.Test
  public void k2SeqExprCast127() {
    final XQuery query = new XQuery(
      "xs:short(\"- 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for byte..
   */
  @org.junit.Test
  public void k2SeqExprCast128() {
    final XQuery query = new XQuery(
      "xs:byte(\"- 5\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast129() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"+ 0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast13() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for nonNegativeInteger(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast130() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"- 0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Space between the sign and the digits is disallowed for positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast131() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"+ 3\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass preceding zeros to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast132() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"-000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-1")
    );
  }

  /**
   *  Pass preceding zeros to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast133() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"-000000000\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Pass preceding zeros to negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast134() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"-000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-1")
    );
  }

  /**
   *  Pass preceding zeros to long..
   */
  @org.junit.Test
  public void k2SeqExprCast135() {
    final XQuery query = new XQuery(
      "xs:long(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to int..
   */
  @org.junit.Test
  public void k2SeqExprCast136() {
    final XQuery query = new XQuery(
      "xs:int(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to short..
   */
  @org.junit.Test
  public void k2SeqExprCast137() {
    final XQuery query = new XQuery(
      "xs:short(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast138() {
    final XQuery query = new XQuery(
      "xs:byte(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast139() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast14() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast140() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast141() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast142() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast143() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass preceding zeros to positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast144() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"000000001\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast145() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"0x0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast146() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"-0x1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in long..
   */
  @org.junit.Test
  public void k2SeqExprCast147() {
    final XQuery query = new XQuery(
      "xs:long(\"0x9223372036854775807\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in int..
   */
  @org.junit.Test
  public void k2SeqExprCast148() {
    final XQuery query = new XQuery(
      "xs:int(\"0x2147483647\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in short..
   */
  @org.junit.Test
  public void k2SeqExprCast149() {
    final XQuery query = new XQuery(
      "xs:short(\"-0x32768\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast15() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"-999999999999999999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-999999999999999999")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in byte..
   */
  @org.junit.Test
  public void k2SeqExprCast150() {
    final XQuery query = new XQuery(
      "xs:byte(\"-0x128\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast151() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"0x0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast152() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"0x0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast153() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"0x0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast154() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"0x0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast155() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"0x0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Hexa-decimal notation isn't allowed in positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast156() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"0x1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast fn:false() to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast157() {
    final XQuery query = new XQuery(
      "xs:language(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "false")
    );
  }

  /**
   *  Cast fn:true() to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast158() {
    final XQuery query = new XQuery(
      "xs:language(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   *  Cast an empty string to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast159() {
    final XQuery query = new XQuery(
      "xs:language(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast16() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"-999999999999999999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-999999999999999999")
    );
  }

  /**
   *  Cast a too long string to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast160() {
    final XQuery query = new XQuery(
      "xs:language(\"abcdefjhl\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast161() {
    final XQuery query = new XQuery(
      "xs:language(\"1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast162() {
    final XQuery query = new XQuery(
      "xs:language(\"a1a\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast163() {
    final XQuery query = new XQuery(
      "xs:language(\"a.a\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast164() {
    final XQuery query = new XQuery(
      "xs:language(\"a*a\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast165() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast166() {
    final XQuery query = new XQuery(
      "xs:language(\"abc--ab\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast167() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-ab-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast168() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast169() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-abcdefikl\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to long..
   */
  @org.junit.Test
  public void k2SeqExprCast17() {
    final XQuery query = new XQuery(
      "xs:long(\"-9223372036854775808\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-9223372036854775808")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast170() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-abcdef.k\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast171() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-ab1efikl\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abc-ab1efikl")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast172() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-a-1b1efikl\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abc-a-1b1efikl")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast173() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-a-1-1b1efil\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abc-a-1-1b1efil")
    );
  }

  /**
   *  Cast string with invalid characters to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast174() {
    final XQuery query = new XQuery(
      "xs:language(\"abc-a-1-1b01efil\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abc-a-1-1b01efil")
    );
  }

  /**
   *  Cast an integer to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast175() {
    final XQuery query = new XQuery(
      "xs:language(1)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a short to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast176() {
    final XQuery query = new XQuery(
      "xs:language(xs:short(\"1\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a xs:date to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast177() {
    final XQuery query = new XQuery(
      "xs:language(current-date())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a xs:time to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast178() {
    final XQuery query = new XQuery(
      "xs:language(current-time())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a xs:dateTime to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast179() {
    final XQuery query = new XQuery(
      "xs:language(current-dateTime())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to int..
   */
  @org.junit.Test
  public void k2SeqExprCast18() {
    final XQuery query = new XQuery(
      "xs:int(\"-2147483648\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-2147483648")
    );
  }

  /**
   *  No function by name xs:name exists..
   */
  @org.junit.Test
  public void k2SeqExprCast180() {
    final XQuery query = new XQuery(
      "xs:name(\"input\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Pass invalid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast181() {
    final XQuery query = new XQuery(
      "xs:Name(\"1abc\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass invalid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast182() {
    final XQuery query = new XQuery(
      "xs:Name(\"ab\\c\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass invalid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast183() {
    final XQuery query = new XQuery(
      "xs:Name(\"ab|\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass invalid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast184() {
    final XQuery query = new XQuery(
      "xs:Name(\"a c\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass invalid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast185() {
    final XQuery query = new XQuery(
      "xs:Name(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass tricky, valid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast186() {
    final XQuery query = new XQuery(
      "xs:Name(\"::::\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "::::")
    );
  }

  /**
   *  Pass tricky, valid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast187() {
    final XQuery query = new XQuery(
      "xs:Name(\"_\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "_")
    );
  }

  /**
   *  Pass tricky, valid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast188() {
    final XQuery query = new XQuery(
      "xs:Name(\":\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, ":")
    );
  }

  /**
   *  Pass tricky, valid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast189() {
    final XQuery query = new XQuery(
      "xs:Name(\"a\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "a")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to short..
   */
  @org.junit.Test
  public void k2SeqExprCast19() {
    final XQuery query = new XQuery(
      "xs:short(\"32767\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("32767")
    );
  }

  /**
   *  Pass tricky, valid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast190() {
    final XQuery query = new XQuery(
      "xs:Name(\" a \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "a")
    );
  }

  /**
   *  Pass tricky, valid input to xs:Name..
   */
  @org.junit.Test
  public void k2SeqExprCast191() {
    final XQuery query = new XQuery(
      "xs:Name(\"a1123-_--__-__--....-.--.-..12309asd\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "a1123-_--__-__--....-.--.-..12309asd")
    );
  }

  /**
   *  Pass an empty string to normalizedString..
   */
  @org.junit.Test
  public void k2SeqExprCast192() {
    final XQuery query = new XQuery(
      "xs:normalizedString(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "")
    );
  }

  /**
   *  Pass an empty string to token..
   */
  @org.junit.Test
  public void k2SeqExprCast193() {
    final XQuery query = new XQuery(
      "xs:token(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "")
    );
  }

  /**
   *  Pass an empty string to language..
   */
  @org.junit.Test
  public void k2SeqExprCast194() {
    final XQuery query = new XQuery(
      "xs:language(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to NMTOKEN..
   */
  @org.junit.Test
  public void k2SeqExprCast195() {
    final XQuery query = new XQuery(
      "xs:NMTOKEN(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to Name..
   */
  @org.junit.Test
  public void k2SeqExprCast196() {
    final XQuery query = new XQuery(
      "xs:Name(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to NCName..
   */
  @org.junit.Test
  public void k2SeqExprCast197() {
    final XQuery query = new XQuery(
      "xs:NCName(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to ID..
   */
  @org.junit.Test
  public void k2SeqExprCast198() {
    final XQuery query = new XQuery(
      "xs:ID(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to IDREF..
   */
  @org.junit.Test
  public void k2SeqExprCast199() {
    final XQuery query = new XQuery(
      "xs:IDREF(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Casting the empty sequence to xs:QName? is ok..
   */
  @org.junit.Test
  public void k2SeqExprCast2() {
    final XQuery query = new XQuery(
      "empty(() cast as xs:QName?)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertBoolean(true)
      ||
        error("XPST0005")
      )
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast20() {
    final XQuery query = new XQuery(
      "xs:byte(\"127\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("127")
    );
  }

  /**
   *  Pass an empty string to ENTITY..
   */
  @org.junit.Test
  public void k2SeqExprCast200() {
    final XQuery query = new XQuery(
      "xs:ENTITY(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  When casting to xs:QName, the declared default element namespace is considered..
   */
  @org.junit.Test
  public void k2SeqExprCast201() {
    final XQuery query = new XQuery(
      "namespace-uri-from-QName(xs:QName(\"ncname\"))",
      ctx);
    query.namespace("", "http://example.com/defelementns");

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://example.com/defelementns")
    );
  }

  /**
   *  Use complex input to xs:NMTOKEN..
   */
  @org.junit.Test
  public void k2SeqExprCast202() {
    final XQuery query = new XQuery(
      "xs:NMTOKEN(\" ::::...:SDA21455313 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "::::...:SDA21455313")
    );
  }

  /**
   *  Whitespace is disallowed inside NMOKEN..
   */
  @org.junit.Test
  public void k2SeqExprCast203() {
    final XQuery query = new XQuery(
      "xs:NMTOKEN(\" f f\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The empty string is invalid in xs:NMTOKEN..
   */
  @org.junit.Test
  public void k2SeqExprCast204() {
    final XQuery query = new XQuery(
      "xs:NMTOKEN(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The empty string is invalid in xs:NMTOKEN(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast205() {
    final XQuery query = new XQuery(
      "xs:NMTOKEN(\" \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a single semi colon to xs:NMTOKEN..
   */
  @org.junit.Test
  public void k2SeqExprCast206() {
    final XQuery query = new XQuery(
      "xs:NMTOKEN(\";\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Construct an xs:anyURI from an invalid string. 
   *       However, in F&O 17.1.1, it is said that "For xs:anyURI, the extent to which an 
   *       implementation validates the lexical form of xs:anyURI is implementation dependent."..
   */
  @org.junit.Test
  public void k2SeqExprCast207() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http:\\\\invalid>URI\\someURI\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertStringValue(false, "http:\\\\invalid>URI\\someURI")
      ||
        error("FORG0001")
      )
    );
  }

  /**
   *  Use a large chunk of whitespace in an xs:anyURI..
   */
  @org.junit.Test
  public void k2SeqExprCast208() {
    final XQuery query = new XQuery(
      "concat(\"b\", xs:anyURI(\" \"), \"b\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "bb")
    );
  }

  /**
   *  Ensure that a large Unicode codepoint is handled correctly in xs:anyURI..
   */
  @org.junit.Test
  public void k2SeqExprCast209() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"\u301c\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "\u301c")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast21() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"999999999999999999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("999999999999999999")
    );
  }

  /**
   *  '%' is not a disallowed character and therefore it's not encoded 
   *       before being considered for RFC 2396 validness..
   */
  @org.junit.Test
  public void k2SeqExprCast210() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"http://www.example.com/file%GF.html\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  No type by name xs:anyAtomic exists..
   */
  @org.junit.Test
  public void k2SeqExprCast211() {
    final XQuery query = new XQuery(
      "xs:anyAtomic(\"1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  No type by name xs:anyAtomic exists(2)..
   */
  @org.junit.Test
  public void k2SeqExprCast212() {
    final XQuery query = new XQuery(
      "xs:anyAtomic(\"1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Cast an xs:positiveInteger value to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast213() {
    final XQuery query = new XQuery(
      "xs:double(xs:positiveInteger(\"52\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("52")
    );
  }

  /**
   *  Cast an xs:int value to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast214() {
    final XQuery query = new XQuery(
      "xs:double(xs:int(\"-1873914410\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-1.87391441E9")
    );
  }

  /**
   *  'Inf' is not a valid value for xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast215() {
    final XQuery query = new XQuery(
      "xs:double(\"Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'Inf' is not a valid value for xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast216() {
    final XQuery query = new XQuery(
      "xs:float(\"Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '-Inf' is not a valid value for xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast217() {
    final XQuery query = new XQuery(
      "xs:double(\"-Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '-Inf' is not a valid value for xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast218() {
    final XQuery query = new XQuery(
      "xs:float(\"-Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+Inf' is not a valid value for xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast219() {
    final XQuery query = new XQuery(
      "xs:double(\"+Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast22() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"18446744073709551615\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertEq("18446744073709551615")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   *  '+Inf' is not a valid value for xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast220() {
    final XQuery query = new XQuery(
      "xs:float(\"+Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Whitespace is ignored for xs:float's lexical space..
   */
  @org.junit.Test
  public void k2SeqExprCast221() {
    final XQuery query = new XQuery(
      "xs:float(\" NaN \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   *  Whitespace is ignored for xs:double's lexical space..
   */
  @org.junit.Test
  public void k2SeqExprCast222() {
    final XQuery query = new XQuery(
      "xs:double(\" NaN \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "NaN")
    );
  }

  /**
   *  Whitespace is ignored for xs:float's lexical space(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast223() {
    final XQuery query = new XQuery(
      "xs:float(\" INF \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   *  Whitespace is ignored for xs:double's lexical space(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast224() {
    final XQuery query = new XQuery(
      "xs:double(\" INF \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "INF")
    );
  }

  /**
   *  'nan' is not a valid value for xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast225() {
    final XQuery query = new XQuery(
      "xs:double(\"nan\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'nan' is not a valid value for xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast226() {
    final XQuery query = new XQuery(
      "xs:float(\"nan\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '- INF' is not a valid value for xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast227() {
    final XQuery query = new XQuery(
      "xs:double(\"- INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '- INF' is not a valid value for xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast228() {
    final XQuery query = new XQuery(
      "xs:float(\"- INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+ INF' is not a valid value for xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast229() {
    final XQuery query = new XQuery(
      "xs:double(\"+ INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast23() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"4294967295\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("4294967295")
    );
  }

  /**
   *  '+ INF' is not a valid value for xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast230() {
    final XQuery query = new XQuery(
      "xs:float(\"+ INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+INF' is not a valid value for xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast231() {
    final XQuery query = new XQuery(
      "xs:double(\"+INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+INF' is not a valid value for xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast232() {
    final XQuery query = new XQuery(
      "xs:float(\"+INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'Inf' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast233() {
    final XQuery query = new XQuery(
      "xs:decimal(\"Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '-Inf' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast234() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+Inf' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast235() {
    final XQuery query = new XQuery(
      "xs:decimal(\"+Inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'nan' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast236() {
    final XQuery query = new XQuery(
      "xs:decimal(\"nan\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '- INF' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast237() {
    final XQuery query = new XQuery(
      "xs:decimal(\"- INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+ INF' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast238() {
    final XQuery query = new XQuery(
      "xs:decimal(\"+ INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  '+INF' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast239() {
    final XQuery query = new XQuery(
      "xs:decimal(\"+INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast24() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"65535\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("65535")
    );
  }

  /**
   *  'INF' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast240() {
    final XQuery query = new XQuery(
      "xs:decimal(\"INF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  'NaN' is not a valid value for xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast241() {
    final XQuery query = new XQuery(
      "xs:decimal(\"NaN\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast242() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast243() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:integer..
   */
  @org.junit.Test
  public void k2SeqExprCast244() {
    final XQuery query = new XQuery(
      "xs:integer(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:integer..
   */
  @org.junit.Test
  public void k2SeqExprCast245() {
    final XQuery query = new XQuery(
      "xs:integer(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast246() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast247() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:integer..
   */
  @org.junit.Test
  public void k2SeqExprCast248() {
    final XQuery query = new XQuery(
      "xs:integer(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:integer..
   */
  @org.junit.Test
  public void k2SeqExprCast249() {
    final XQuery query = new XQuery(
      "xs:integer(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast25() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"255\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("255")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast250() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast251() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:integer..
   */
  @org.junit.Test
  public void k2SeqExprCast252() {
    final XQuery query = new XQuery(
      "xs:integer(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:integer..
   */
  @org.junit.Test
  public void k2SeqExprCast253() {
    final XQuery query = new XQuery(
      "xs:integer(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast254() {
    final XQuery query = new XQuery(
      "xs:byte(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast255() {
    final XQuery query = new XQuery(
      "xs:byte(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast256() {
    final XQuery query = new XQuery(
      "xs:byte(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast257() {
    final XQuery query = new XQuery(
      "xs:byte(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast258() {
    final XQuery query = new XQuery(
      "xs:byte(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast259() {
    final XQuery query = new XQuery(
      "xs:byte(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Pass a large, the largest if such a limit exists, to positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast26() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"999999999999999999\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("999999999999999999")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast260() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast261() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast262() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast263() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast264() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast265() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast266() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast267() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast268() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast269() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast fn:false() to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast27() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast270() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast271() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:long..
   */
  @org.junit.Test
  public void k2SeqExprCast272() {
    final XQuery query = new XQuery(
      "xs:long(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:long..
   */
  @org.junit.Test
  public void k2SeqExprCast273() {
    final XQuery query = new XQuery(
      "xs:long(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:long..
   */
  @org.junit.Test
  public void k2SeqExprCast274() {
    final XQuery query = new XQuery(
      "xs:long(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:long..
   */
  @org.junit.Test
  public void k2SeqExprCast275() {
    final XQuery query = new XQuery(
      "xs:long(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:long..
   */
  @org.junit.Test
  public void k2SeqExprCast276() {
    final XQuery query = new XQuery(
      "xs:long(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:long..
   */
  @org.junit.Test
  public void k2SeqExprCast277() {
    final XQuery query = new XQuery(
      "xs:long(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:int..
   */
  @org.junit.Test
  public void k2SeqExprCast278() {
    final XQuery query = new XQuery(
      "xs:int(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:int..
   */
  @org.junit.Test
  public void k2SeqExprCast279() {
    final XQuery query = new XQuery(
      "xs:int(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast fn:true() to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast28() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:int..
   */
  @org.junit.Test
  public void k2SeqExprCast280() {
    final XQuery query = new XQuery(
      "xs:int(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:int..
   */
  @org.junit.Test
  public void k2SeqExprCast281() {
    final XQuery query = new XQuery(
      "xs:int(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:int..
   */
  @org.junit.Test
  public void k2SeqExprCast282() {
    final XQuery query = new XQuery(
      "xs:int(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:int..
   */
  @org.junit.Test
  public void k2SeqExprCast283() {
    final XQuery query = new XQuery(
      "xs:int(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:short..
   */
  @org.junit.Test
  public void k2SeqExprCast284() {
    final XQuery query = new XQuery(
      "xs:short(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:short..
   */
  @org.junit.Test
  public void k2SeqExprCast285() {
    final XQuery query = new XQuery(
      "xs:short(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:short..
   */
  @org.junit.Test
  public void k2SeqExprCast286() {
    final XQuery query = new XQuery(
      "xs:short(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:short..
   */
  @org.junit.Test
  public void k2SeqExprCast287() {
    final XQuery query = new XQuery(
      "xs:short(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:short..
   */
  @org.junit.Test
  public void k2SeqExprCast288() {
    final XQuery query = new XQuery(
      "xs:short(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:short..
   */
  @org.junit.Test
  public void k2SeqExprCast289() {
    final XQuery query = new XQuery(
      "xs:short(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast fn:false() to negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast29() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast290() {
    final XQuery query = new XQuery(
      "xs:byte(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast291() {
    final XQuery query = new XQuery(
      "xs:byte(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast292() {
    final XQuery query = new XQuery(
      "xs:byte(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast293() {
    final XQuery query = new XQuery(
      "xs:byte(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast294() {
    final XQuery query = new XQuery(
      "xs:byte(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:byte..
   */
  @org.junit.Test
  public void k2SeqExprCast295() {
    final XQuery query = new XQuery(
      "xs:byte(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast296() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast297() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast298() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast299() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("FOCA0002")
      ||
        error("XPST0005")
      )
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast3() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast fn:true() to negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast30() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast300() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast301() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast302() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast303() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast304() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast305() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast306() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast307() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast308() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast309() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast fn:false() to long..
   */
  @org.junit.Test
  public void k2SeqExprCast31() {
    final XQuery query = new XQuery(
      "xs:long(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast310() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast311() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast312() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast313() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast314() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast315() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast316() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast317() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast318() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast319() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast fn:true() to long..
   */
  @org.junit.Test
  public void k2SeqExprCast32() {
    final XQuery query = new XQuery(
      "xs:long(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast320() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast321() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast322() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast323() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast324() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast325() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(-INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast326() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:float(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(-INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast327() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:double(\"-INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:float(INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast328() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:float(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(INF) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast329() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:double(\"INF\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast fn:false() to int..
   */
  @org.junit.Test
  public void k2SeqExprCast33() {
    final XQuery query = new XQuery(
      "xs:int(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:float(NaN) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast330() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:float(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  Cast xs:double(NaN) to xs:unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast331() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(xs:double(\"NaN\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FOCA0002")
    );
  }

  /**
   *  No function by name xs:unsignedInteger exists..
   */
  @org.junit.Test
  public void k2SeqExprCast332() {
    final XQuery query = new XQuery(
      "xs:unsignedInteger(1)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0017")
    );
  }

  /**
   *  Cast xs:byte to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast333() {
    final XQuery query = new XQuery(
      "xs:double(xs:byte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:int to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast334() {
    final XQuery query = new XQuery(
      "xs:double(xs:int(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:long to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast335() {
    final XQuery query = new XQuery(
      "xs:double(xs:long(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:negativeInteger to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast336() {
    final XQuery query = new XQuery(
      "xs:double(xs:negativeInteger(-3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-3")
    );
  }

  /**
   *  Cast xs:nonNegativeInteger to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast337() {
    final XQuery query = new XQuery(
      "xs:double(xs:nonNegativeInteger(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:nonPositiveInteger to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast338() {
    final XQuery query = new XQuery(
      "xs:double(xs:nonPositiveInteger(0))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:short to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast339() {
    final XQuery query = new XQuery(
      "xs:double(xs:short(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast fn:true() to int..
   */
  @org.junit.Test
  public void k2SeqExprCast34() {
    final XQuery query = new XQuery(
      "xs:int(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:unsignedByte to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast340() {
    final XQuery query = new XQuery(
      "xs:double(xs:unsignedByte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast341() {
    final XQuery query = new XQuery(
      "xs:double(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast342() {
    final XQuery query = new XQuery(
      "xs:double(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedLong to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast343() {
    final XQuery query = new XQuery(
      "xs:double(xs:unsignedLong(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedShort to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast344() {
    final XQuery query = new XQuery(
      "xs:double(xs:unsignedShort(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:byte to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast345() {
    final XQuery query = new XQuery(
      "xs:float(xs:byte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:int to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast346() {
    final XQuery query = new XQuery(
      "xs:float(xs:int(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:long to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast347() {
    final XQuery query = new XQuery(
      "xs:float(xs:long(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:negativeInteger to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast348() {
    final XQuery query = new XQuery(
      "xs:float(xs:negativeInteger(-3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-3")
    );
  }

  /**
   *  Cast xs:nonNegativeInteger to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast349() {
    final XQuery query = new XQuery(
      "xs:float(xs:nonNegativeInteger(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast fn:false() to short..
   */
  @org.junit.Test
  public void k2SeqExprCast35() {
    final XQuery query = new XQuery(
      "xs:short(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:nonPositiveInteger to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast350() {
    final XQuery query = new XQuery(
      "xs:float(xs:nonPositiveInteger(0))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:short to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast351() {
    final XQuery query = new XQuery(
      "xs:float(xs:short(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedByte to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast352() {
    final XQuery query = new XQuery(
      "xs:float(xs:unsignedByte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast353() {
    final XQuery query = new XQuery(
      "xs:float(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast354() {
    final XQuery query = new XQuery(
      "xs:float(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedLong to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast355() {
    final XQuery query = new XQuery(
      "xs:float(xs:unsignedLong(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedShort to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast356() {
    final XQuery query = new XQuery(
      "xs:float(xs:unsignedShort(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:byte to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast357() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:byte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:int to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast358() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:int(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:long to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast359() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:long(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast fn:true() to short..
   */
  @org.junit.Test
  public void k2SeqExprCast36() {
    final XQuery query = new XQuery(
      "xs:short(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:negativeInteger to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast360() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:negativeInteger(-3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-3")
    );
  }

  /**
   *  Cast xs:nonNegativeInteger to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast361() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:nonNegativeInteger(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:nonPositiveInteger to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast362() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:nonPositiveInteger(0))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:short to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast363() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:short(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedByte to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast364() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:unsignedByte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast365() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast366() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedLong to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast367() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:unsignedLong(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:unsignedShort to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast368() {
    final XQuery query = new XQuery(
      "xs:decimal(xs:unsignedShort(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("3")
    );
  }

  /**
   *  Cast xs:byte to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast369() {
    final XQuery query = new XQuery(
      "xs:string(xs:byte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast fn:false() to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast37() {
    final XQuery query = new XQuery(
      "xs:byte(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:int to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast370() {
    final XQuery query = new XQuery(
      "xs:string(xs:int(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:long to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast371() {
    final XQuery query = new XQuery(
      "xs:string(xs:long(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:negativeInteger to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast372() {
    final XQuery query = new XQuery(
      "xs:string(xs:negativeInteger(-3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-3")
    );
  }

  /**
   *  Cast xs:nonNegativeInteger to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast373() {
    final XQuery query = new XQuery(
      "xs:string(xs:nonNegativeInteger(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:nonPositiveInteger to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast374() {
    final XQuery query = new XQuery(
      "xs:string(xs:nonPositiveInteger(0))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0")
    );
  }

  /**
   *  Cast xs:short to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast375() {
    final XQuery query = new XQuery(
      "xs:string(xs:short(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedByte to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast376() {
    final XQuery query = new XQuery(
      "xs:string(xs:unsignedByte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast377() {
    final XQuery query = new XQuery(
      "xs:string(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast378() {
    final XQuery query = new XQuery(
      "xs:string(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedLong to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast379() {
    final XQuery query = new XQuery(
      "xs:string(xs:unsignedLong(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast fn:true() to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast38() {
    final XQuery query = new XQuery(
      "xs:byte(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:unsignedShort to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast380() {
    final XQuery query = new XQuery(
      "xs:string(xs:unsignedShort(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:byte to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast381() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:byte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:int to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast382() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:int(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:long to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast383() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:long(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:negativeInteger to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast384() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:negativeInteger(-3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "-3")
    );
  }

  /**
   *  Cast xs:nonNegativeInteger to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast385() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:nonNegativeInteger(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:nonPositiveInteger to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast386() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:nonPositiveInteger(0))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0")
    );
  }

  /**
   *  Cast xs:short to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast387() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:short(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedByte to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast388() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:unsignedByte(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast389() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast fn:false() to nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast39() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:unsignedInt to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast390() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:unsignedInt(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedLong to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast391() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:unsignedLong(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedShort to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast392() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:unsignedShort(3))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "3")
    );
  }

  /**
   *  Cast xs:unsignedShort to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast393() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:normalizedString(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:token to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast394() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:token(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:language to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast395() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:language(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:NMTOKEN to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast396() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:NMTOKEN(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:Name to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast397() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:Name(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:NCName to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast398() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:NCName(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:ID to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast399() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:ID(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast4() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-1")
    );
  }

  /**
   *  Cast fn:true() to nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast40() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:IDREF to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast400() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:IDREF(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:ENTITY to xs:untypedAtomic..
   */
  @org.junit.Test
  public void k2SeqExprCast401() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(xs:ENTITY(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:unsignedShort to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast402() {
    final XQuery query = new XQuery(
      "xs:string(xs:normalizedString(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:token to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast403() {
    final XQuery query = new XQuery(
      "xs:string(xs:token(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:language to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast404() {
    final XQuery query = new XQuery(
      "xs:string(xs:language(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:NMTOKEN to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast405() {
    final XQuery query = new XQuery(
      "xs:string(xs:NMTOKEN(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:Name to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast406() {
    final XQuery query = new XQuery(
      "xs:string(xs:Name(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:NCName to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast407() {
    final XQuery query = new XQuery(
      "xs:string(xs:NCName(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:ID to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast408() {
    final XQuery query = new XQuery(
      "xs:string(xs:ID(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast xs:IDREF to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast409() {
    final XQuery query = new XQuery(
      "xs:string(xs:IDREF(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast fn:false() to unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast41() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:ENTITY to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast410() {
    final XQuery query = new XQuery(
      "xs:string(xs:ENTITY(\"foo\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "foo")
    );
  }

  /**
   *  Cast "a" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast411() {
    final XQuery query = new XQuery(
      "xs:language(\"a\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "a")
    );
  }

  /**
   *  Cast "ab" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast412() {
    final XQuery query = new XQuery(
      "xs:language(\"ab\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "ab")
    );
  }

  /**
   *  Cast "abc" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast413() {
    final XQuery query = new XQuery(
      "xs:language(\"abc\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abc")
    );
  }

  /**
   *  Cast "abcd" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast414() {
    final XQuery query = new XQuery(
      "xs:language(\"abcd\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abcd")
    );
  }

  /**
   *  Cast "abcde" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast415() {
    final XQuery query = new XQuery(
      "xs:language(\"abcde\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abcde")
    );
  }

  /**
   *  Cast "abcdef" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast416() {
    final XQuery query = new XQuery(
      "xs:language(\"abcdef\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abcdef")
    );
  }

  /**
   *  Cast "abcdefg" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast417() {
    final XQuery query = new XQuery(
      "xs:language(\"abcdefg\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abcdefg")
    );
  }

  /**
   *  Cast "abcdefgh" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast418() {
    final XQuery query = new XQuery(
      "xs:language(\"abcdefgh\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abcdefgh")
    );
  }

  /**
   *  Cast "abcdefgh-abcdefgh" to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast419() {
    final XQuery query = new XQuery(
      "xs:language(\"abcdefgh-abcdefgh\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "abcdefgh-abcdefgh")
    );
  }

  /**
   *  Cast fn:true() to unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast42() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  The whitespace facet for xs:anyURI is collapse..
   */
  @org.junit.Test
  public void k2SeqExprCast420() {
    final XQuery query = new XQuery(
      "xs:anyURI(\" http://example.com/ foo.xml \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "http://example.com/ foo.xml")
    );
  }

  /**
   *  Pass an invalid anyURI..
   */
  @org.junit.Test
  public void k2SeqExprCast421() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"foo://\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        assertStringValue(false, "foo://")
      ||
        assertStringValue(false, "foo:")
      ||
        error("FORG0001")
      )
    );
  }

  /**
   *  Pass an invalid anyURI(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast422() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"%gg\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  An URI without scheme..
   */
  @org.junit.Test
  public void k2SeqExprCast423() {
    final XQuery query = new XQuery(
      "xs:anyURI(\":/cut.jpg\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  An URI without scheme, combined with a relative directory..
   */
  @org.junit.Test
  public void k2SeqExprCast424() {
    final XQuery query = new XQuery(
      "xs:anyURI(\":/images/cut.png\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Serialize a set of xs:QName instances..
   */
  @org.junit.Test
  public void k2SeqExprCast425() {
    final XQuery query = new XQuery(
      "\"START\", \n" +
      "      \t\tQName(\"http://example.com\", \"prefix:localName\"), \n" +
      "      \t\tQName(\"http://example.com\", \"localName\"), \n" +
      "      \t\tQName(\"http://example.com\", \"localName\"), \n" +
      "      \t\tQName(\"\", \"localName\"), QName((), \"localName\"), \n" +
      "      \t\t\"END\"",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertSerialization("START prefix:localName localName localName localName localName END", false)
    );
  }

  /**
   *  Cast a set of QName to xs:string..
   */
  @org.junit.Test
  public void k2SeqExprCast426() {
    final XQuery query = new XQuery(
      "\"START\", \n" +
      "      \tstring(QName(\"http://example.com\", \n" +
      "      \t\"prefix:localName\")), \n" +
      "      \tstring(QName(\"http://example.com\", \"localName\")), \n" +
      "      \tstring(QName(\"http://example.com\", \"localName\")), \n" +
      "      \tstring(QName(\"\", \"localName\")), \n" +
      "      \tstring(QName((), \"localName\")), \n" +
      "      \t\"END\" ",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertSerialization("START prefix:localName localName localName localName localName END", false)
    );
  }

  /**
   *  Use a relative URI with double slashes..
   */
  @org.junit.Test
  public void k2SeqExprCast427() {
    final XQuery query = new XQuery(
      "xs:anyURI(\"//server/share/dir1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "//server/share/dir1")
    );
  }

  /**
   *  A relatively large negative number, fed to xs:unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast428() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"-9876\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:-1:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast429() {
    final XQuery query = new XQuery(
      "xs:time(\"11:-1:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast fn:false() to unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast43() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:time("11:+1:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast430() {
    final XQuery query = new XQuery(
      "xs:time(\"11:+1:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11: 1:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast431() {
    final XQuery query = new XQuery(
      "xs:time(\"11: 1:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:-1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast432() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:-1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast433() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:+1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast434() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:+1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11: 1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast435() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11: 1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("-1:11:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast436() {
    final XQuery query = new XQuery(
      "xs:time(\"-1:11:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("+1:11:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast437() {
    final XQuery query = new XQuery(
      "xs:time(\"+1:11:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("+1:11:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast438() {
    final XQuery query = new XQuery(
      "xs:time(\"+1:11:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:1e0"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast439() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:1e0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast fn:true() to unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast44() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:time("11:11:1E0"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast440() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:1E0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:1b0"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast441() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:1b0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11: 10"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast442() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11: 10\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11b33"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast443() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11b33\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:111"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast444() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:111\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11.+11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast445() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11.+11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11.-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast446() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11.-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11. 11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast447() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11. 11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("24:00:00.1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast448() {
    final XQuery query = new XQuery(
      "xs:time(\"24:00:00.1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("24:01:00"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast449() {
    final XQuery query = new XQuery(
      "xs:time(\"24:01:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast fn:false() to unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast45() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:time("24:00:01"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast450() {
    final XQuery query = new XQuery(
      "xs:time(\"24:00:01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11++1:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast451() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11++1:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11+-1:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast452() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11+-1:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11+ 1:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast453() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11+ 1:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11+11:+1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast454() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11+11:+1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11+11:-1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast455() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11+11:-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:11+11: 1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast456() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:11+11: 1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast457() {
    final XQuery query = new XQuery(
      "xs:time(\"11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("1 :11:11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast458() {
    final XQuery query = new XQuery(
      "xs:time(\"1 :11:11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time("11:11:1 "), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast459() {
    final XQuery query = new XQuery(
      "xs:time(\"11:11:1 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast fn:true() to unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast46() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:date("+2002-12-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast460() {
    final XQuery query = new XQuery(
      "xs:date(\"+2002-12-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date(" 111-11-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast461() {
    final XQuery query = new XQuery(
      "xs:date(\" 111-11-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date(" +11-11-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast462() {
    final XQuery query = new XQuery(
      "xs:date(\" +11-11-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111- 1-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast463() {
    final XQuery query = new XQuery(
      "xs:date(\"1111- 1-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("-111-11-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast464() {
    final XQuery query = new XQuery(
      "xs:date(\"-111-11-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("+111-11-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast465() {
    final XQuery query = new XQuery(
      "xs:date(\"+111-11-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111-11- 1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast466() {
    final XQuery query = new XQuery(
      "xs:date(\"1111-11- 1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111-+1-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast467() {
    final XQuery query = new XQuery(
      "xs:date(\"1111-+1-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111-11-+1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast468() {
    final XQuery query = new XQuery(
      "xs:date(\"1111-11-+1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111--1-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast469() {
    final XQuery query = new XQuery(
      "xs:date(\"1111--1-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast fn:false() to unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast47() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast xs:date("1111-11--1"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast470() {
    final XQuery query = new XQuery(
      "xs:date(\"1111-11--1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111-11-1F"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast471() {
    final XQuery query = new XQuery(
      "xs:date(\"1111-11-1F\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("0x10-11-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast472() {
    final XQuery query = new XQuery(
      "xs:date(\"0x10-11-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("111 -11-11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast473() {
    final XQuery query = new XQuery(
      "xs:date(\"111 -11-11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111-1 -11"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast474() {
    final XQuery query = new XQuery(
      "xs:date(\"1111-1 -11\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:date("1111-11-1 "), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast475() {
    final XQuery query = new XQuery(
      "xs:date(\"1111-11-1 \")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:dateTime("2002-11-23"), which is an invalid lexical representation..
   */
  @org.junit.Test
  public void k2SeqExprCast476() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-11-23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Serialize xs:gYear("0040")..
   */
  @org.junit.Test
  public void k2SeqExprCast477() {
    final XQuery query = new XQuery(
      "xs:gYear(\"0040\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0040")
    );
  }

  /**
   *  Serialize xs:gYearMonth("0040-01")..
   */
  @org.junit.Test
  public void k2SeqExprCast478() {
    final XQuery query = new XQuery(
      "xs:gYearMonth(\"0040-01\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "0040-01")
    );
  }

  /**
   *  Cast to xs:QName, using a namespace from an element constructor..
   */
  @org.junit.Test
  public void k2SeqExprCast479() {
    final XQuery query = new XQuery(
      "<e xmlns:prefix=\"http://example.com/\"> { xs:QName(\"prefix:localName\") } </e>",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertSerialization("<e xmlns:prefix=\"http://example.com/\">prefix:localName</e>", false)
    );
  }

  /**
   *  Cast fn:true() to unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast48() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  All primitives in one query. Sub-types of xs:decimal. Sub-types of xs:decimal. Sub-types of xs:string.
   */
  @org.junit.Test
  public void k2SeqExprCast480() {
    final XQuery query = new XQuery(
      "xs:untypedAtomic(\"xs:untypedAtomic\"), xs:dateTime(\"2002-10-10T23:02:12Z\"), xs:date(\"2002-10-10Z\"), xs:time(\"23:02:12Z\"),\n" +
      "                xs:duration(\"P12M\"), xs:dayTimeDuration(\"PT1S\"), xs:yearMonthDuration(\"P1M\"), xs:float(\"3e3\"), xs:double(\"4e4\"),\n" +
      "                xs:decimal(\"2.0\"), xs:integer(\"16\"), xs:nonPositiveInteger(\"0\"), xs:negativeInteger(\"-4\"), xs:long(\"5\"),\n" +
      "                xs:int(\"6\"), xs:short(\"7\"), xs:byte(\"8\"), xs:nonNegativeInteger(\"9\"), xs:unsignedLong(\"10\"),\n" +
      "                xs:unsignedInt(\"11\"), xs:unsignedShort(\"12\"), xs:unsignedByte(\"13\"), xs:positiveInteger(\"14\"),\n" +
      "                xs:gYearMonth(\"1976-02Z\"), xs:gYear(\"2005-12:00\"), xs:gMonthDay(\"--12-25-14:00\"),\n" +
      "                xs:gDay(\"---25-14:00\"), xs:gMonth(\"--12-14:00\"), xs:boolean(\"true\"), xs:base64Binary(\"aaaa\"),\n" +
      "                xs:hexBinary(\"FFFF\"), xs:anyURI(\"http://example.com/\"), xs:QName(\"localName\"),\n" +
      "                xs:string(\"An xs:string\"), xs:normalizedString(\"normalizedString\"), xs:token(\"token\"),\n" +
      "                xs:language(\"language\"), xs:NMTOKEN(\"NMTOKEN\"), xs:Name(\"Name\"), xs:NCName(\"NCName\"),\n" +
      "                xs:ID(\"ID\"), xs:IDREF(\"IDREF\"), xs:ENTITY(\"ENTITY\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(true, "\n             xs:untypedAtomic 2002-10-10T23:02:12Z 2002-10-10Z 23:02:12Z P1Y PT1S P1M 3000 40000 2 16 0\n             -4 5 6 7 8 9 10 11 12 13 14 1976-02Z 2005-12:00 --12-25-14:00 ---25-14:00 --12-14:00 true\n             aaaa FFFF http://example.com/ localName An xs:string normalizedString token language\n             NMTOKEN Name NCName ID IDREF ENTITY")
    );
  }

  /**
   *  Try to cast inf to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast481() {
    final XQuery query = new XQuery(
      "\"inf\" cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Try to cast 'inF' to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast482() {
    final XQuery query = new XQuery(
      "\"inF\" cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Try to cast '-inF' to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast483() {
    final XQuery query = new XQuery(
      "\"-inF\" cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Try to cast 'inF ' to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast484() {
    final XQuery query = new XQuery(
      "\"inF \" cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Try to cast '-inF(space)' to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast485() {
    final XQuery query = new XQuery(
      "\"-inF \" cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Try to cast 'naN' to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast486() {
    final XQuery query = new XQuery(
      "\"naN\" cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Try to cast ' naN' to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast487() {
    final XQuery query = new XQuery(
      "\" naN\" cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:QName to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast488() {
    final XQuery query = new XQuery(
      "xs:language(QName(\"http://example.com/\", \"p:localName\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:base64Binary to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast489() {
    final XQuery query = new XQuery(
      "xs:language(xs:base64Binary(\"1111\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast fn:false() to positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast49() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(false())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:hexBinary to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast490() {
    final XQuery query = new XQuery(
      "xs:language(xs:hexBinary(\"11\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:gMonth to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast491() {
    final XQuery query = new XQuery(
      "xs:language(xs:gMonth(\"--10\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:gDay to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast492() {
    final XQuery query = new XQuery(
      "xs:language(xs:gDay(\"---11\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:gMonthDay to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast493() {
    final XQuery query = new XQuery(
      "xs:language(xs:gMonthDay(\"--10-15\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:gYear to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast494() {
    final XQuery query = new XQuery(
      "xs:language(xs:gYear(\"4004\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:integer to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast495() {
    final XQuery query = new XQuery(
      "xs:language(xs:integer(\"543\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:decimal to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast496() {
    final XQuery query = new XQuery(
      "xs:language(xs:decimal(\"543\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:double to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast497() {
    final XQuery query = new XQuery(
      "xs:language(xs:double(\"543\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:float to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast498() {
    final XQuery query = new XQuery(
      "xs:language(xs:float(\"543\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:time to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast499() {
    final XQuery query = new XQuery(
      "xs:language(current-time())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to long..
   */
  @org.junit.Test
  public void k2SeqExprCast5() {
    final XQuery query = new XQuery(
      "xs:long(\"9223372036854775807\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("9223372036854775807")
    );
  }

  /**
   *  Cast fn:true() to positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast50() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(true())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Cast xs:date to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast500() {
    final XQuery query = new XQuery(
      "xs:language(current-date())",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:duration to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast501() {
    final XQuery query = new XQuery(
      "xs:language(xs:duration(\"P1M\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:dayTimeDuration to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast502() {
    final XQuery query = new XQuery(
      "xs:language(xs:dayTimeDuration(\"P1DT4H\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast xs:yearMonthDuration to xs:language..
   */
  @org.junit.Test
  public void k2SeqExprCast503() {
    final XQuery query = new XQuery(
      "xs:language(xs:yearMonthDuration(\"P4Y5M\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Use a series of corner case Unicode codepoints..
   */
  @org.junit.Test
  public void k2SeqExprCast504() {
    final XQuery query = new XQuery(
      "xs:NCName(codepoints-to-string((3648, 3592, 3617, 3626, 3660)))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "เจมส์")
    );
  }

  /**
   *  ':/' is an invalid URI, no scheme..
   */
  @org.junit.Test
  public void k2SeqExprCast505() {
    final XQuery query = new XQuery(
      "xs:anyURI(\":/\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast invalid gMonth..
   */
  @org.junit.Test
  public void k2SeqExprCast506() {
    final XQuery query = new XQuery(
      "xs:gMonth(\"--02--\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast inF to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast507() {
    final XQuery query = new XQuery(
      "xs:float(\"inF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast inF to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast508() {
    final XQuery query = new XQuery(
      "xs:double(\"inF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast inF to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast509() {
    final XQuery query = new XQuery(
      "xs:decimal(\"inF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  -0 is an invalid value for xs:negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast51() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast inf to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast510() {
    final XQuery query = new XQuery(
      "xs:float(\"inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast inf to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast511() {
    final XQuery query = new XQuery(
      "xs:double(\"inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast inf to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast512() {
    final XQuery query = new XQuery(
      "xs:decimal(\"inf\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast InF to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast513() {
    final XQuery query = new XQuery(
      "xs:float(\"InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast InF to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast514() {
    final XQuery query = new XQuery(
      "xs:double(\"InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast InF to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast515() {
    final XQuery query = new XQuery(
      "xs:decimal(\"InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast -InF to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast516() {
    final XQuery query = new XQuery(
      "xs:float(\"-InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast -InF to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast517() {
    final XQuery query = new XQuery(
      "xs:double(\"-InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast -InF to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast518() {
    final XQuery query = new XQuery(
      "xs:decimal(\"-InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast +InF to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast519() {
    final XQuery query = new XQuery(
      "xs:float(\"+InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The minus sign is allowed unsignedLong. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast52() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast +InF to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast520() {
    final XQuery query = new XQuery(
      "xs:double(\"+InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast +InF to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast521() {
    final XQuery query = new XQuery(
      "xs:decimal(\"+InF\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast naN to xs:float..
   */
  @org.junit.Test
  public void k2SeqExprCast522() {
    final XQuery query = new XQuery(
      "xs:float(\"naN\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast naN to xs:double..
   */
  @org.junit.Test
  public void k2SeqExprCast523() {
    final XQuery query = new XQuery(
      "xs:double(\"naN\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast naN to xs:decimal..
   */
  @org.junit.Test
  public void k2SeqExprCast524() {
    final XQuery query = new XQuery(
      "xs:decimal(\"naN\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The minus sign is allowed unsignedInt. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast53() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The minus sign is allowed unsignedShort. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast54() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The minus sign is allowed in unsignedByte. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast55() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The minus sign is prohibited in positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast56() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The minus sign is prohibited in positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast57() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The plus sign is allowed in unsignedLong. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast58() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"+0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The plus sign is allowed in unsignedInt. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast59() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"+0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to int..
   */
  @org.junit.Test
  public void k2SeqExprCast6() {
    final XQuery query = new XQuery(
      "xs:int(\"2147483647\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("2147483647")
    );
  }

  /**
   *  The plus sign is allowed in unsignedShort. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast60() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"+0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The plus sign is allowed in unsignedByte. 
   *       S4S is considered normative, and XSD 1.1 adjusted the prose to say the same..
   */
  @org.junit.Test
  public void k2SeqExprCast61() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"+0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The plus sign is prohibited in negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast62() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"+0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The plus sign is prohibited in nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast63() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"+1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  The minus sign is allowed in nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast64() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The minus sign is allowed in negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast65() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-1")
    );
  }

  /**
   *  The minus sign is allowed in nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast66() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"-0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  The minus sign is allowed in nonPositiveInteger(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast67() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-1")
    );
  }

  /**
   *  Ensure a plus sign is accepted for positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast68() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"+1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Ensure a plus sign is accepted for nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast69() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"+1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to short..
   */
  @org.junit.Test
  public void k2SeqExprCast7() {
    final XQuery query = new XQuery(
      "xs:short(\"-32768\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-32768")
    );
  }

  /**
   *  Ensure a plus sign is accepted for nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast70() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"+0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Multiple minus signs is disallowed in nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast71() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"--0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Multiple minus signs is disallowed in negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast72() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"--1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Multiple minus signs is disallowed in nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast73() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"--0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Multiple minus signs is disallowed in nonPositiveInteger(#2)..
   */
  @org.junit.Test
  public void k2SeqExprCast74() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"--1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Multiple plus signs is allowed in positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast75() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"++1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Multiple plus signs is allowed in nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast76() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"++1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Multiple plus signs is allowed in nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast77() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"++0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to long..
   */
  @org.junit.Test
  public void k2SeqExprCast78() {
    final XQuery query = new XQuery(
      "xs:long(\"-9223372036854775809\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("FORG0001")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   *  Cast a too small value to int..
   */
  @org.junit.Test
  public void k2SeqExprCast79() {
    final XQuery query = new XQuery(
      "xs:int(\"-2147483649\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast8() {
    final XQuery query = new XQuery(
      "xs:byte(\"-128\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("-128")
    );
  }

  /**
   *  Cast a too small value to short..
   */
  @org.junit.Test
  public void k2SeqExprCast80() {
    final XQuery query = new XQuery(
      "xs:short(\"-32769\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast81() {
    final XQuery query = new XQuery(
      "xs:byte(\"-129\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast82() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to unsignedLong..
   */
  @org.junit.Test
  public void k2SeqExprCast83() {
    final XQuery query = new XQuery(
      "xs:unsignedLong(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to unsignedInt..
   */
  @org.junit.Test
  public void k2SeqExprCast84() {
    final XQuery query = new XQuery(
      "xs:unsignedInt(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to unsignedShort..
   */
  @org.junit.Test
  public void k2SeqExprCast85() {
    final XQuery query = new XQuery(
      "xs:unsignedShort(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to unsignedByte..
   */
  @org.junit.Test
  public void k2SeqExprCast86() {
    final XQuery query = new XQuery(
      "xs:unsignedByte(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too small value to positiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast87() {
    final XQuery query = new XQuery(
      "xs:positiveInteger(\"-1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too large value to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast88() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"1\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too large value to negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast89() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass a small, the smallest if such a limit exists, to nonNegativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast9() {
    final XQuery query = new XQuery(
      "xs:nonNegativeInteger(\"0\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("0")
    );
  }

  /**
   *  Cast a too large value to long..
   */
  @org.junit.Test
  public void k2SeqExprCast90() {
    final XQuery query = new XQuery(
      "xs:long(\"9223372036854775808\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      (
        error("FORG0001")
      ||
        error("FOAR0002")
      )
    );
  }

  /**
   *  Cast a too large value to int..
   */
  @org.junit.Test
  public void k2SeqExprCast91() {
    final XQuery query = new XQuery(
      "xs:int(\"2147483648\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too large value to short..
   */
  @org.junit.Test
  public void k2SeqExprCast92() {
    final XQuery query = new XQuery(
      "xs:short(\"32768\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Cast a too large value to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast93() {
    final XQuery query = new XQuery(
      "xs:byte(\"128\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to nonPositiveInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast94() {
    final XQuery query = new XQuery(
      "xs:nonPositiveInteger(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to negativeInteger..
   */
  @org.junit.Test
  public void k2SeqExprCast95() {
    final XQuery query = new XQuery(
      "xs:negativeInteger(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to long..
   */
  @org.junit.Test
  public void k2SeqExprCast96() {
    final XQuery query = new XQuery(
      "xs:long(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to int..
   */
  @org.junit.Test
  public void k2SeqExprCast97() {
    final XQuery query = new XQuery(
      "xs:int(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to short..
   */
  @org.junit.Test
  public void k2SeqExprCast98() {
    final XQuery query = new XQuery(
      "xs:short(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Pass an empty string to byte..
   */
  @org.junit.Test
  public void k2SeqExprCast99() {
    final XQuery query = new XQuery(
      "xs:byte(\"\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("FORG0001")
    );
  }

  /**
   *  Simple test for evaluation of a simple expression casted as xs:integer.
   */
  @org.junit.Test
  public void casthc1() {
    final XQuery query = new XQuery(
      "(5 + 5) cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("10")
    );
  }

  /**
   *  Simple test for casting a float as a double.
   */
  @org.junit.Test
  public void casthc10() {
    final XQuery query = new XQuery(
      "xs:float(2.1E3) cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("2100")
    );
  }

  /**
   *  Simple test for casting a float as a boolean.
   */
  @org.junit.Test
  public void casthc11() {
    final XQuery query = new XQuery(
      "xs:float(2.1E3) cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test for casting a double as a double.
   */
  @org.junit.Test
  public void casthc12() {
    final XQuery query = new XQuery(
      "xs:double(1267.43233E12) cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1.26743233E15")
    );
  }

  /**
   *  Simple test for casting a double as a string.
   */
  @org.junit.Test
  public void casthc13() {
    final XQuery query = new XQuery(
      "xs:double(1267.43233E12) cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1.26743233E15")
    );
  }

  /**
   *  Simple test for casting a double as a float.
   */
  @org.junit.Test
  public void casthc14() {
    final XQuery query = new XQuery(
      "(xs:double(1267.43233E12) cast as xs:float) eq xs:float(1267.43233E12)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test for casting a double as a boolean.
   */
  @org.junit.Test
  public void casthc15() {
    final XQuery query = new XQuery(
      "xs:double(1267.43233E12) cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test for casting a decimal as a string.
   */
  @org.junit.Test
  public void casthc16() {
    final XQuery query = new XQuery(
      "xs:decimal(12678967.543233) cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "12678967.543233")
    );
  }

  /**
   *  Simple test for casting a decimal as a float.
   */
  @org.junit.Test
  public void casthc17() {
    final XQuery query = new XQuery(
      "xs:decimal(12678967.543233) cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1.2678968E7")
    );
  }

  /**
   *  Simple test for casting a decimal as a double.
   */
  @org.junit.Test
  public void casthc18() {
    final XQuery query = new XQuery(
      "xs:decimal(12678967.543233) cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1.2678967543233E7")
    );
  }

  /**
   *  Simple test for casting a decimal as a decimal.
   */
  @org.junit.Test
  public void casthc19() {
    final XQuery query = new XQuery(
      "xs:decimal(12678967.543233) cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "12678967.543233")
    );
  }

  /**
   *  Simple test for evaluation of a simple expression casted as xs:float.
   */
  @org.junit.Test
  public void casthc2() {
    final XQuery query = new XQuery(
      "(5 + 5) cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("10")
    );
  }

  /**
   *  Simple test for casting a decimal as a integer.
   */
  @org.junit.Test
  public void casthc20() {
    final XQuery query = new XQuery(
      "xs:decimal(12678967.543233) cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("12678967")
    );
  }

  /**
   *  Simple test for casting a decimal as a boolean.
   */
  @org.junit.Test
  public void casthc21() {
    final XQuery query = new XQuery(
      "xs:decimal(12678967.543233) cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test for casting an integer as a string.
   */
  @org.junit.Test
  public void casthc22() {
    final XQuery query = new XQuery(
      "xs:integer(12678967543233) cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "12678967543233")
    );
  }

  /**
   *  Simple test for casting an integer as a float.
   */
  @org.junit.Test
  public void casthc23() {
    final XQuery query = new XQuery(
      "(xs:integer(12678967543233) cast as xs:float) eq xs:float(12678967543233)",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test for casting an integer as a double.
   */
  @org.junit.Test
  public void casthc24() {
    final XQuery query = new XQuery(
      "xs:integer(12678967543233) cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1.2678967543233E13")
    );
  }

  /**
   *  Simple test for casting an integer as a decimal.
   */
  @org.junit.Test
  public void casthc25() {
    final XQuery query = new XQuery(
      "xs:integer(12678967543233) cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("12678967543233")
    );
  }

  /**
   *  Simple test for casting an integer as an integer.
   */
  @org.junit.Test
  public void casthc26() {
    final XQuery query = new XQuery(
      "xs:integer(12678967543233) cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("12678967543233")
    );
  }

  /**
   *  Simple test for casting an integer as a boolean.
   */
  @org.junit.Test
  public void casthc27() {
    final XQuery query = new XQuery(
      "xs:integer(12678967543233) cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test for casting an dateTime as a string.
   */
  @org.junit.Test
  public void casthc28() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00-05:00\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T13:20:00-05:00")
    );
  }

  /**
   *  Simple test for casting an dateTime as a dateTime.
   */
  @org.junit.Test
  public void casthc29() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00-05:00\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T13:20:00-05:00")
    );
  }

  /**
   *  Simple test for evaluation of a simple expression casted as xs:boolean.
   */
  @org.junit.Test
  public void casthc3() {
    final XQuery query = new XQuery(
      "(5 + 5) cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Simple test for casting an dateTime as a time.
   */
  @org.junit.Test
  public void casthc30() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00-05:00\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "13:20:00-05:00")
    );
  }

  /**
   *  Simple test for casting an dateTime as a date.
   */
  @org.junit.Test
  public void casthc31() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-05-31T13:20:00-05:00\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31-05:00")
    );
  }

  /**
   *  Simple test for casting an date as a string.
   */
  @org.junit.Test
  public void casthc32() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   *  Simple test for casting an date as a dateTime.
   */
  @org.junit.Test
  public void casthc33() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:dateTime",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31T00:00:00")
    );
  }

  /**
   *  Simple test for casting an date as a date.
   */
  @org.junit.Test
  public void casthc34() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-05-31\") cast as xs:date",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "1999-05-31")
    );
  }

  /**
   *  Simple test for casting an xs:time as a string.
   */
  @org.junit.Test
  public void casthc35() {
    final XQuery query = new XQuery(
      "xs:time(\"12:00:00\") cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "12:00:00")
    );
  }

  /**
   *  Simple test for casting an xs:time as an xs:time.
   */
  @org.junit.Test
  public void casthc36() {
    final XQuery query = new XQuery(
      "xs:time(\"12:00:00\") cast as xs:time",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "12:00:00")
    );
  }

  /**
   *  Simple test for casting a boolean as string.
   */
  @org.junit.Test
  public void casthc37() {
    final XQuery query = new XQuery(
      "fn:true() cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "true")
    );
  }

  /**
   *  Simple test for casting a boolean as float.
   */
  @org.junit.Test
  public void casthc38() {
    final XQuery query = new XQuery(
      "fn:true() cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Simple test for casting a boolean as double.
   */
  @org.junit.Test
  public void casthc39() {
    final XQuery query = new XQuery(
      "fn:true() cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Simple test for evaluation of a simple expression casted as xs:double.
   */
  @org.junit.Test
  public void casthc4() {
    final XQuery query = new XQuery(
      "(5 + 5) cast as xs:double",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("10")
    );
  }

  /**
   *  Simple test for casting a boolean as decimal.
   */
  @org.junit.Test
  public void casthc40() {
    final XQuery query = new XQuery(
      "fn:true() cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Simple test for casting a boolean as integer.
   */
  @org.junit.Test
  public void casthc41() {
    final XQuery query = new XQuery(
      "fn:true() cast as xs:integer",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("1")
    );
  }

  /**
   *  Simple test for casting a boolean as boolean.
   */
  @org.junit.Test
  public void casthc42() {
    final XQuery query = new XQuery(
      "fn:true() cast as xs:boolean",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  casting a string into an xs:NOTATION.
   */
  @org.junit.Test
  public void casthc43() {
    final XQuery query = new XQuery(
      "xs:string(\"A String\") cast as xs:NOTATION",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPST0080")
    );
  }

  /**
   *  Simple test for evaluation of a simple expression casted as xs:decimal.
   */
  @org.junit.Test
  public void casthc5() {
    final XQuery query = new XQuery(
      "(5 + 5) cast as xs:decimal",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("10")
    );
  }

  /**
   *  Simple test for evaluation of a simple expression casted as xs:string.
   */
  @org.junit.Test
  public void casthc6() {
    final XQuery query = new XQuery(
      "(5 + 5) cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "10")
    );
  }

  /**
   *  Simple test for evaluation a string casted as xs:string.
   */
  @org.junit.Test
  public void casthc7() {
    final XQuery query = new XQuery(
      "\"A String\" cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "A String")
    );
  }

  /**
   *  Simple test for casting a float as a float.
   */
  @org.junit.Test
  public void casthc8() {
    final XQuery query = new XQuery(
      "xs:float(2.1E3) cast as xs:float",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertEq("2100")
    );
  }

  /**
   *  Simple test for casting a float as a string.
   */
  @org.junit.Test
  public void casthc9() {
    final XQuery query = new XQuery(
      "xs:float(2.1E3) cast as xs:string",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertStringValue(false, "2100")
    );
  }
}
