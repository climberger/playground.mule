package de.cl.playground.mule.data;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

@Xml(prefix = "data")
@Extension(name = "Data")
@Configurations(DataConfiguration.class)
public class DataExtension {

}