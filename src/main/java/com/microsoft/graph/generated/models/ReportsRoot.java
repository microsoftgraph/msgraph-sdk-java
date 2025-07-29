package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ReportsRoot} and sets the default values.
     */
    public ReportsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportsRoot}
     */
    @jakarta.annotation.Nonnull
    public static ReportsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportsRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("readingAssignmentSubmissions", (n) -> { this.setReadingAssignmentSubmissions(n.getCollectionOfObjectValues(ReadingAssignmentSubmission::createFromDiscriminatorValue)); });
        deserializerMap.put("reflectCheckInResponses", (n) -> { this.setReflectCheckInResponses(n.getCollectionOfObjectValues(ReflectCheckInResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the readingAssignmentSubmissions property value. The readingAssignmentSubmissions property
     * @return a {@link java.util.List<ReadingAssignmentSubmission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReadingAssignmentSubmission> getReadingAssignmentSubmissions() {
        return this.backingStore.get("readingAssignmentSubmissions");
    }
    /**
     * Gets the reflectCheckInResponses property value. The reflectCheckInResponses property
     * @return a {@link java.util.List<ReflectCheckInResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReflectCheckInResponse> getReflectCheckInResponses() {
        return this.backingStore.get("reflectCheckInResponses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("readingAssignmentSubmissions", this.getReadingAssignmentSubmissions());
        writer.writeCollectionOfObjectValues("reflectCheckInResponses", this.getReflectCheckInResponses());
    }
    /**
     * Sets the readingAssignmentSubmissions property value. The readingAssignmentSubmissions property
     * @param value Value to set for the readingAssignmentSubmissions property.
     */
    public void setReadingAssignmentSubmissions(@jakarta.annotation.Nullable final java.util.List<ReadingAssignmentSubmission> value) {
        this.backingStore.set("readingAssignmentSubmissions", value);
    }
    /**
     * Sets the reflectCheckInResponses property value. The reflectCheckInResponses property
     * @param value Value to set for the reflectCheckInResponses property.
     */
    public void setReflectCheckInResponses(@jakarta.annotation.Nullable final java.util.List<ReflectCheckInResponse> value) {
        this.backingStore.set("reflectCheckInResponses", value);
    }
}
