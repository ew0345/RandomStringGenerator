# String Generator #

This is a program that will generate strings based on what the user specifies.

Usage:
```
java -jar StringGen.jar [--info|true] [<stringAmount>] [<stringLength>] [<stringType>]
```
If the first argument is true then `stringAmount`, `stringLength` and `stringType` are not optional arguments.  
If the first argument is `--info` then other arguments must not be present.  

### Valid options for the `stringType` argument are 1 to 7 in the java and old kotlin version or 1 to 11 in the new kotlin version ###
  ***___Java/Old Kotlin:___***  
&nbsp;&nbsp; 1: Letters only  
&nbsp;&nbsp; 2: Numbers only  
&nbsp;&nbsp; 3: Symbols only  
&nbsp;&nbsp; 4: Letters & numbers  
&nbsp;&nbsp; 5: Letters & symbols  
&nbsp;&nbsp; 6: Numbers & symbols  
&nbsp;&nbsp; 7: All  
    
***___Kotlin:___***  
&nbsp;&nbsp; 1: Uppercase letters only  
&nbsp;&nbsp; 2: Lowercase letters only  
&nbsp;&nbsp; 3: Mixed-case letters only  
&nbsp;&nbsp; 4: Numbers only  
&nbsp;&nbsp; 5: Base symbols only  
&nbsp;&nbsp; 6: Modifier symbols only (Symbols that require shift to be held down to type)  
&nbsp;&nbsp; 7: Symbols only  
&nbsp;&nbsp; 8: Letters & numbers only  
&nbsp;&nbsp; 9: Letters & symbols only  
&nbsp;&nbsp; 10: Numbers & symbols only  
&nbsp;&nbsp; 11: All
