package com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.microsoftgraphidentitygovernancecreatenewversion;

import com.microsoft.graph.models.identitygovernance.Workflow;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CreateNewVersionPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The workflow property
     */
    private Workflow workflow;
    /**
     * Instantiates a new createNewVersionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreateNewVersionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createNewVersionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateNewVersionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateNewVersionPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("workflow", (n) -> { this.setWorkflow(n.getObjectValue(Workflow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the workflow property value. The workflow property
     * @return a workflow
     */
    @javax.annotation.Nullable
    public Workflow getWorkflow() {
        return this.workflow;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("workflow", this.getWorkflow());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the workflow property value. The workflow property
     * @param value Value to set for the workflow property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkflow(@javax.annotation.Nullable final Workflow value) {
        this.workflow = value;
    }
}
