package org.springframework.data.neo4j.integration.issues.gh2323;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
@EqualsAndHashCode
@Data
public class KnowsMtEntity {

    @Id
    @GeneratedValue
	private Long id;

	private String blubb;

    @TargetNode
	private Language language;

}
