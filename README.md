# RegistryHelperLib

Are you tired of writing a lot of code to register all the things of minecraft?  
With this little library, you will be able to register in an easier way.

## Installation

Add the Modrinth's Maven Repository in build.gradle:
```groovy
    repositories {
        maven {
		    name = 'Modrinth'
		    url = 'https://api.modrinth.com/maven'
		    content {
			includeGroup 'maven.modrinth'
		}
	}
    }
```
Then add the mod implementation, still in build.gradle:

```groovy
    dependencies{
        //other dependencies
        modImplementation("maven.modrinth:registry-helper-lib:${project.registry_helper_version}")
    }
```

Then add the version variable in gradle.properties. Replace the version below by the version of the lib you want:
```ini

    registry_helper_version=1.0.0+1.21
```

## How to use it?
Create an instance of the RegistryHelper class. This instance will allow you to register for a registry type.
```java
    public class ModItems {
        private static final RegistryHelper<Item> registryHelper=new RegistryHelper<>(Registries.ITEM,ExampleMod.MOD_ID);
        public static final Item EXAMPLE_ITEM= registryHelper.register("name",new Item(new Item.Settings()));

        public static void init(){
        
        }
    }
```


