# RegistryHelperLib

Are you tired of writing a lot of code to register all the things of minecraft?  
With this little library, you will be able to register in an easier way.

<h2>
Instalation
</h2>
Add the Modrinth's Maven Repository in build.gradle:
<div style="background-color: darkgray">

    repositories {
        maven {
		    name = 'Modrinth'
		    url = 'https://api.modrinth.com/maven'
		    content {
			includeGroup 'maven.modrinth'
		}
	}
</div>
Then add the mod implementation, still in build.gradle:
<div style="background-color: darkgray">

    dependencies{
        //other dependencies
        modImplementation("maven.modrinth:registry-helper-lib:${project.registry_helper_version}")
    }
</div>
Then add the version variable in gradle.properties. Replace the version below by the version of the lib you want:
<div style="background-color: darkgray">

    registry_helper_version=1.0.0+1.21
</div>
<h2>
how to use it?
</h2>
Create an instance of the RegistryHelper class. This instance will allow you to register for a registry type.
<div style="background-color: darkgray">

    public class ModItems {
        private static final RegistryHelper<Item> registryHelper=new RegistryHelper<>(Registries.ITEM,ExampleMod.MOD_ID);
        public static final Item EXAMPLE_ITEM= registryHelper.register("name",new Item(new Item.Settings()));

        public static void init(){
        
        }
    }
</div>

