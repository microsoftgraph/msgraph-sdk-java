package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSOfficeSuiteApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new MacOSOfficeSuiteApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSOfficeSuiteApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSOfficeSuiteApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSOfficeSuiteApp
     */
    @javax.annotation.Nonnull
    public static MacOSOfficeSuiteApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSOfficeSuiteApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSOfficeSuiteApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
        }};
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
