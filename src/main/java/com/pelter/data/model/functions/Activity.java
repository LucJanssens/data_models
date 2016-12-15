package com.pelter.data.model.functions;

public @interface Activity {
   
    String description() default "";
    
    /**
     * Getter for property lastModifiedDate.
     *
     * @return Value of property last update date.
     */
    String lastModifiedDate() default "";

    /**
     * Getter for property createDate.
    *
    * @return Value of property creation date.
    */
    String createDate() default "";
}