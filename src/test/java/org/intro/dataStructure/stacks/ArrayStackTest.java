package org.intro.dataStructure.stacks;

import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void test() {
        ArrayStack<String> stk = new ArrayStack<>();
        stk.push("one");
        stk.push("two");
        stk.push("three");
        Assert.assertEquals(stk.pop(), "three");
        Assert.assertEquals(stk.pop(), "two");
        stk.push("four");
        Assert.assertEquals(stk.pop(), "four");
    }
}
