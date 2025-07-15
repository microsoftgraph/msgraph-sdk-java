package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseItem extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BaseItem} and sets the default values.
     */
    public BaseItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BaseItem}
     */
    @jakarta.annotation.Nonnull
    public static BaseItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.baseSitePage": return new BaseSitePage();
                case "#microsoft.graph.drive": return new Drive();
                case "#microsoft.graph.driveItem": return new DriveItem();
                case "#microsoft.graph.list": return new List();
                case "#microsoft.graph.listItem": return new ListItem();
                case "#microsoft.graph.recycleBin": return new RecycleBin();
                case "#microsoft.graph.recycleBinItem": return new RecycleBinItem();
                case "#microsoft.graph.sharedDriveItem": return new SharedDriveItem();
                case "#microsoft.graph.site": return new Site();
                case "#microsoft.graph.sitePage": return new SitePage();
            }
        }
        return new BaseItem();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
