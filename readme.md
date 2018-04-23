# Cast Extension

#### Erstellt mit Archetype:
mvn org.mule.extensions:mule-extensions-archetype-maven-plugin:1.1.0:generate

##### Archetpye liegt in Mule-Repositories:
Mule-Profile in ~/.m2/settings.xml eintragen:

    <profiles>
		<profile>
			<id>mule</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<repositories>
				<repository>
					<id>mulesoft-releases</id>
					<name>MuleSoft Repository</name>
					<url>http://repository.mulesoft.org/releases/</url>
					<layout>default</layout>
					<releases>
						<enabled>true</enabled>
					</releases>
				</repository>
				<repository>
					<id>mulesoft-snapshots</id>
					<name>MuleSoft Snapshot Repository</name>
					<url>http://repository.mulesoft.org/snapshots/</url>
					<layout>default</layout>
					<releases>
						<enabled>true</enabled>
					</releases>
				</repository>
			</repositories>
			<pluginRepositories>
				<pluginRepository>
					<id>mulesoft-releases</id>
					<name>MuleSoft Repository</name>
					<url>http://repository.mulesoft.org/releases/</url>
					<layout>default</layout>
					<releases>
						<enabled>true</enabled>
					</releases>
				</pluginRepository>
				<pluginRepository>
					<id>mulesoft-snapshots</id>
					<name>MuleSoft Snapshot Repository</name>
					<url>http://repository.mulesoft.org/snapshots/</url>
					<layout>default</layout>
					<releases>
						<enabled>true</enabled>
					</releases>
				</pluginRepository>
			</pluginRepositories>
		</profile>
	</profiles>

#### For the SDK to work, you must pass the command line parameter -parameters to the Java compiler.
see: https://docs.mulesoft.com/mule-sdk/v/1.1/getting-started

`-parameters` als compile-Parameter eintragen

#### Maven Snippet for Anypoint Mule Project
    <dependency>
        <groupId>com.nterra.cast</groupId>
	    <artifactId>muleconnector</artifactId>
	    <version>4.0.0</version>
	    <classifier>mule-plugin</classifier>
    </dependency>
