package br.com.simplespringdatareactivewithcassandra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
@EnableReactiveCassandraRepositories
public class CassandraReactiveConfig extends AbstractReactiveCassandraConfiguration {


	@Override
	protected String getKeyspaceName() {
		return "testkeyspace";
	}

	@Override
	protected String getContactPoints() {
		return "127.0.0.1";
	}
	

	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.CREATE;
	}
}