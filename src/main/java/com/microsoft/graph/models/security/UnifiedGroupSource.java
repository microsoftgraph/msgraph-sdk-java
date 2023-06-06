package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Group;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedGroupSource extends DataSource implements Parsable {
    /** The group property */
    private Group group;
    /** Specifies which sources are included in this group. Possible values are: mailbox, site. */
    private SourceType includedSources;
    /**
     * Instantiates a new UnifiedGroupSource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedGroupSource() {
        super();
        this.setOdataType("#microsoft.graph.security.unifiedGroupSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedGroupSource
     */
    @javax.annotation.Nonnull
    public static UnifiedGroupSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedGroupSource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("includedSources", (n) -> { this.setIncludedSources(n.getEnumValue(SourceType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group property
     * @return a group
     */
    @javax.annotation.Nullable
    public Group getGroup() {
        return this.group;
    }
    /**
     * Gets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @return a sourceType
     */
    @javax.annotation.Nullable
    public SourceType getIncludedSources() {
        return this.includedSources;
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
        writer.writeObjectValue("group", this.getGroup());
        writer.writeEnumValue("includedSources", this.getIncludedSources());
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroup(@javax.annotation.Nullable final Group value) {
        this.group = value;
    }
    /**
     * Sets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @param value Value to set for the includedSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludedSources(@javax.annotation.Nullable final SourceType value) {
        this.includedSources = value;
    }
}
