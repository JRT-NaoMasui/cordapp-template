package com.template.plugin

import net.corda.core.node.CordaPluginRegistry
import net.corda.core.serialization.SerializationCustomization

class TemplateCordaPlugin : CordaPluginRegistry() {
    /**
     * Whitelisting the required types for serialisation by the Corda node.
     */
    override fun customizeSerialization(custom: SerializationCustomization): Boolean {
        return true
    }
}