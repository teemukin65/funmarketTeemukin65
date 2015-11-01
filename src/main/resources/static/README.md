# funmarket-teemukin65-frontend


Here we have simple demo web marketplace front-end for leaving and viewing advertisements.

Server side can be found at github teemukin65
This is based on Funmarket background system found at:

http://mepa-store-api.herokuapp.com/




### Open items for real production use at frontend

- minifying of the javascript files
- modification of the index html to get minified version of the at production
- tests for Angularjs modules
- including the previous to maven build cycle



## Usage

To manage javascript library versions, bower tool is used.

To see currently installed and available versions:
```
bower list 
```

To install new library

```
bower install <pkg name and semver version>
```

Storing of some debug information to DOM is turned off here in production for speed purposes. 
If you want to use browser debugging features, enter following to browser console:
  
```
angular.reloadWithDebugInfo();
```

## Contribution

Pull requests OK at github

## Build and development

Build handled by maven in the top directory.


### Tool versions used in building: 
 
 * bower 1.6.5   -- for managing javascript libraries  

 




## Testing

TBD.
