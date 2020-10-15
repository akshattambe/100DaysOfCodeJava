package org.example.akshat;

public class NullPointerOrIllegalArgument {


    /**
     * 1.   Javadoc for IllegalArgumentException, it says -
     *      it's for use when an illegal or inappropriate value is passed to a method.
     *      We can consider a null object to be illegal or inappropriate if our method isn't expecting it.
     *      And so, this would be an appropriate exception for us to throw.
     *
     * 2.   When we receive a NullPointerException,
     *      we're going to go as deep into the stack as we can to see what we're referencing that's null.
     *      Im some cases it way easier, for eg. when WebDriver instance is not initialized correctly and left Null.
     *
     *      When we get an IllegalArgumentException,
     *      we'll look in the stack for the bottom-most method we're calling and start our debugging from there.
     *
     * 3.   Consider IllegalArgumentException to be meant for cases when we don't have a more specific exception type available to us.
     */
    public void MethodNotNull_001(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Parameter 'object' cannot be null");
        }
    }


    /**
     * 1.   According to Javadoc- If our method parameter isn't intended to be null,
     *      then we could reasonably consider this as an object being required and throw the NullPointerException.
     *      common JDK methods we call throw a NullPointerException if we provide a null.
     *
     * 2.   NullPointerException is very specific exception types rather than the more generic IllegalArgumentException.
     *
     * 3.   Javadoc doesn't support this theory that only the JDK should be throwing NullPointerException.
     *
     */
    public void MethodNotNull_002(Object object) {
        if (object == null) {
            throw new NullPointerException("Parameter 'object' cannot be null");
        }
    }

    /**
     * Conclusion:  I too think that the documentation for the two exceptions seems to overlap.
     *              Although, the whichever exception we chose, we should be consistent throughout our application,
     *              and make our exceptions more useful by providing meaningful information.
     */

}
