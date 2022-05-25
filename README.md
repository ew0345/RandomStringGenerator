# String Generator #

This is a program that will generate strings based on what the user specifies.

Usage:
```
java -jar StringGen.jar [--info|true] [<stringAmount>] [<stringLength>] [<stringType>]
```
If the first argument is true then `stringAmount`, `stringLength` and `stringType` are not optional arguments.

### Valid options for the `stringType` argument are 1 to 7 in the java and old kotlin version or 1 to 23 in the new kotlin version ###
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
&nbsp;&nbsp; 8: Uppercase letters & numbers only  
&nbsp;&nbsp; 9: Lowercase letters & numbers only  
&nbsp;&nbsp; 10: Mixed-case letters & numbers only  
&nbsp;&nbsp; 11: Uppercase letters & base symbols only  
&nbsp;&nbsp; 12: Uppercase letters & modifier symbols only  
&nbsp;&nbsp; 13: Uppercase letters & symbols only  
&nbsp;&nbsp; 14: Lowercase letters & base symbols only  
&nbsp;&nbsp; 15: Lowercase letters & modifier symbols only  
&nbsp;&nbsp; 16: Lowercase letters & symbols only   
&nbsp;&nbsp; 17: Mixed-case letters & base symbols only  
&nbsp;&nbsp; 18: Mixed-case letters & modifier symbols only  
&nbsp;&nbsp; 19: Mixed-case letters & symbols only  
&nbsp;&nbsp; 20: Numbers & base symbols only  
&nbsp;&nbsp; 21: Numbers & modifier symbols only  
&nbsp;&nbsp; 22: Numbers & symbols only  
&nbsp;&nbsp; 23: All


Version information:  
&nbsp;&nbsp; Java version: StringGen.java. This is the current latest java version.  
&nbsp;&nbsp; Old Kotlin version: StringGen.kt. This is old kotlin version, has feature parity with the java version.  
&nbsp;&nbsp; New Kotlin version: StringGen folder. This is the current latest version of the new Kotlin version, has feature parity with the other versions as well as additional `stringType` options and more infomative `--info`.
