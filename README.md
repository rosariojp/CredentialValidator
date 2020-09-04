# CredentialValidator
A class that can validate username and password

#### Username Specification
* 8 to 12 alphanumeric characters long
* Must begin with letter
* Lower case letters and numbers only
* Does not contain any special characters

#### Password Specification
* 8 to 20 characters long
* Contains alphanumeric and special characters
* Have at least 1 number
* Have at least 1 upper case character
* Have at least 1 lower case character

#### Usage
1. Checking username validity
```
String username = "juandelacruz";
boolean isValid = isValidUsername(username);
```
2. Checking password validity
```
String password = "JuanDe1@cruz";
boolean isValid = isValidPassword(password);
```
