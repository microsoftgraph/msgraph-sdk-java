package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupBasedSubjectSet extends SubjectSet implements Parsable {
    /**
     * Instantiates a new {@link GroupBasedSubjectSet} and sets the default values.
     */
    public GroupBasedSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.groupBasedSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupBasedSubjectSet}
     */
    @jakarta.annotation.Nonnull
    public static GroupBasedSubjectSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupBasedSubjectSet();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The groups property
     * @return a {@link java.util.List<Group>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getGroups() {
        return this.backingStore.get("groups");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
    }
    /**
     * Sets the groups property value. The groups property
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.backingStore.set("groups", value);
    }
}
