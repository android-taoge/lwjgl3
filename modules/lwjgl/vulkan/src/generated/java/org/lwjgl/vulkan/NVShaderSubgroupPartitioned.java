/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension enables support for a new class of subgroup operations via the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GL_NV_shader_subgroup_partitioned.txt">{@code GL_NV_shader_subgroup_partitioned}</a> GLSL extension and <a target="_blank" href="http://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_subgroup_partitioned.html">{@code SPV_NV_shader_subgroup_partitioned}</a> SPIR-V extension. Support for these new operations is advertised via the {@link #VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV SUBGROUP_FEATURE_PARTITIONED_BIT_NV} bit.
 * 
 * <p>This extension requires Vulkan 1.1, for general subgroup support.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_shader_subgroup_partitioned}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>199</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz @jbolz</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-03-17</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVShaderSubgroupPartitioned {

    /** The extension specification version. */
    public static final int VK_NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME = "VK_NV_shader_subgroup_partitioned";

    /** Extends {@code VkSubgroupFeatureFlagBits}. */
    public static final int VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV = 0x100;

    private NVShaderSubgroupPartitioned() {}

}