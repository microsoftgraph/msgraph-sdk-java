package com.microsoft.graph.models;

import com.microsoft.graph.models.AttributeRuleMembers;
import com.microsoft.graph.models.ConnectedOrganizationMembers;
import com.microsoft.graph.models.ExternalSponsors;
import com.microsoft.graph.models.GroupMembers;
import com.microsoft.graph.models.InternalSponsors;
import com.microsoft.graph.models.RequestorManager;
import com.microsoft.graph.models.SingleServicePrincipal;
import com.microsoft.graph.models.SingleUser;
import com.microsoft.graph.models.TargetApplicationOwners;
import com.microsoft.graph.models.TargetManager;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubjectSet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new subjectSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubjectSet() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.subjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subjectSet
     */
    @javax.annotation.Nonnull
    public static SubjectSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.attributeRuleMembers": return new AttributeRuleMembers();
                case "#microsoft.graph.connectedOrganizationMembers": return new ConnectedOrganizationMembers();
                case "#microsoft.graph.externalSponsors": return new ExternalSponsors();
                case "#microsoft.graph.groupMembers": return new GroupMembers();
                case "#microsoft.graph.internalSponsors": return new InternalSponsors();
                case "#microsoft.graph.requestorManager": return new RequestorManager();
                case "#microsoft.graph.singleServicePrincipal": return new SingleServicePrincipal();
                case "#microsoft.graph.singleUser": return new SingleUser();
                case "#microsoft.graph.targetApplicationOwners": return new TargetApplicationOwners();
                case "#microsoft.graph.targetManager": return new TargetManager();
            }
        }
        return new SubjectSet();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubjectSet currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
