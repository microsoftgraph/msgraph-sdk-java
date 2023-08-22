package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskDetails extends Entity implements Parsable {
    /**
     * The collection of checklist items on the task.
     */
    private PlannerChecklistItems checklist;
    /**
     * Description of the task.
     */
    private String description;
    /**
     * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     */
    private PlannerPreviewType previewType;
    /**
     * The collection of references on the task.
     */
    private PlannerExternalReferences references;
    /**
     * Instantiates a new plannerTaskDetails and sets the default values.
     */
    public PlannerTaskDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTaskDetails
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskDetails();
    }
    /**
     * Gets the checklist property value. The collection of checklist items on the task.
     * @return a plannerChecklistItems
     */
    @jakarta.annotation.Nullable
    public PlannerChecklistItems getChecklist() {
        return this.checklist;
    }
    /**
     * Gets the description property value. Description of the task.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("checklist", (n) -> { this.setChecklist(n.getObjectValue(PlannerChecklistItems::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("previewType", (n) -> { this.setPreviewType(n.getEnumValue(PlannerPreviewType.class)); });
        deserializerMap.put("references", (n) -> { this.setReferences(n.getObjectValue(PlannerExternalReferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     * @return a plannerPreviewType
     */
    @jakarta.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this.previewType;
    }
    /**
     * Gets the references property value. The collection of references on the task.
     * @return a plannerExternalReferences
     */
    @jakarta.annotation.Nullable
    public PlannerExternalReferences getReferences() {
        return this.references;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("checklist", this.getChecklist());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("previewType", this.getPreviewType());
        writer.writeObjectValue("references", this.getReferences());
    }
    /**
     * Sets the checklist property value. The collection of checklist items on the task.
     * @param value Value to set for the checklist property.
     */
    public void setChecklist(@jakarta.annotation.Nullable final PlannerChecklistItems value) {
        this.checklist = value;
    }
    /**
     * Sets the description property value. Description of the task.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     * @param value Value to set for the previewType property.
     */
    public void setPreviewType(@jakarta.annotation.Nullable final PlannerPreviewType value) {
        this.previewType = value;
    }
    /**
     * Sets the references property value. The collection of references on the task.
     * @param value Value to set for the references property.
     */
    public void setReferences(@jakarta.annotation.Nullable final PlannerExternalReferences value) {
        this.references = value;
    }
}
