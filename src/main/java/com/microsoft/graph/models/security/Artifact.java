package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Artifact extends Entity implements Parsable {
    /**
     * Instantiates a new artifact and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Artifact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a artifact
     */
    @javax.annotation.Nonnull
    public static Artifact createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.host": return new Host();
                case "#microsoft.graph.security.hostComponent": return new HostComponent();
                case "#microsoft.graph.security.hostCookie": return new HostCookie();
                case "#microsoft.graph.security.hostname": return new Hostname();
                case "#microsoft.graph.security.hostTracker": return new HostTracker();
                case "#microsoft.graph.security.ipAddress": return new IpAddress();
                case "#microsoft.graph.security.passiveDnsRecord": return new PassiveDnsRecord();
                case "#microsoft.graph.security.unclassifiedArtifact": return new UnclassifiedArtifact();
            }
        }
        return new Artifact();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
