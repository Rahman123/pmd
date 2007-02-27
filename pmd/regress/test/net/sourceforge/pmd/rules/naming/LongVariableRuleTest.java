/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package test.net.sourceforge.pmd.rules.naming;

import org.junit.Before;
import org.junit.Test;

import net.sourceforge.pmd.Rule;
import test.net.sourceforge.pmd.testframework.SimpleAggregatorTst;

public class LongVariableRuleTest extends SimpleAggregatorTst {
    private Rule rule;

    @Before
    public void setUp() {
        rule = findRule("naming", "LongVariable");
    }

    @Test
    public void testAll() {
        runTests(rule);
    }

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(LongVariableRuleTest.class);
    }
}