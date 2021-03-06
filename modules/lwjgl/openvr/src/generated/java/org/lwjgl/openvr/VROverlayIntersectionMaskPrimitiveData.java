/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * union VROverlayIntersectionMaskPrimitive_Data_t {
 *     {@link IntersectionMaskRectangle IntersectionMaskRectangle_t} m_Rectangle;
 *     {@link IntersectionMaskCircle IntersectionMaskCircle_t} m_Circle;
 * }</pre></code>
 */
@NativeType("union VROverlayIntersectionMaskPrimitive_Data_t")
public class VROverlayIntersectionMaskPrimitiveData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_RECTANGLE,
        M_CIRCLE;

    static {
        Layout layout = __union(
            __member(IntersectionMaskRectangle.SIZEOF, IntersectionMaskRectangle.ALIGNOF),
            __member(IntersectionMaskCircle.SIZEOF, IntersectionMaskCircle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_RECTANGLE = layout.offsetof(0);
        M_CIRCLE = layout.offsetof(1);
    }

    VROverlayIntersectionMaskPrimitiveData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VROverlayIntersectionMaskPrimitiveData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayIntersectionMaskPrimitiveData(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link IntersectionMaskRectangle} view of the {@code m_Rectangle} field. */
    @NativeType("IntersectionMaskRectangle_t")
    public IntersectionMaskRectangle m_Rectangle() { return nm_Rectangle(address()); }
    /** Returns a {@link IntersectionMaskCircle} view of the {@code m_Circle} field. */
    @NativeType("IntersectionMaskCircle_t")
    public IntersectionMaskCircle m_Circle() { return nm_Circle(address()); }

    /** Copies the specified {@link IntersectionMaskRectangle} to the {@code m_Rectangle} field. */
    public VROverlayIntersectionMaskPrimitiveData m_Rectangle(@NativeType("IntersectionMaskRectangle_t") IntersectionMaskRectangle value) { nm_Rectangle(address(), value); return this; }
    /** Copies the specified {@link IntersectionMaskCircle} to the {@code m_Circle} field. */
    public VROverlayIntersectionMaskPrimitiveData m_Circle(@NativeType("IntersectionMaskCircle_t") IntersectionMaskCircle value) { nm_Circle(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VROverlayIntersectionMaskPrimitiveData set(VROverlayIntersectionMaskPrimitiveData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionMaskPrimitiveData malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionMaskPrimitiveData calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance allocated with {@link BufferUtils}. */
    public static VROverlayIntersectionMaskPrimitiveData create() {
        return new VROverlayIntersectionMaskPrimitiveData(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance for the specified memory address. */
    public static VROverlayIntersectionMaskPrimitiveData create(long address) {
        return new VROverlayIntersectionMaskPrimitiveData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionMaskPrimitiveData createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionMaskPrimitiveData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance allocated on the thread-local {@link MemoryStack}. */
    public static VROverlayIntersectionMaskPrimitiveData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VROverlayIntersectionMaskPrimitiveData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionMaskPrimitiveData mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionMaskPrimitiveData callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitiveData.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_Rectangle}. */
    public static IntersectionMaskRectangle nm_Rectangle(long struct) { return IntersectionMaskRectangle.create(struct + VROverlayIntersectionMaskPrimitiveData.M_RECTANGLE); }
    /** Unsafe version of {@link #m_Circle}. */
    public static IntersectionMaskCircle nm_Circle(long struct) { return IntersectionMaskCircle.create(struct + VROverlayIntersectionMaskPrimitiveData.M_CIRCLE); }

    /** Unsafe version of {@link #m_Rectangle(IntersectionMaskRectangle) m_Rectangle}. */
    public static void nm_Rectangle(long struct, IntersectionMaskRectangle value) { memCopy(value.address(), struct + VROverlayIntersectionMaskPrimitiveData.M_RECTANGLE, IntersectionMaskRectangle.SIZEOF); }
    /** Unsafe version of {@link #m_Circle(IntersectionMaskCircle) m_Circle}. */
    public static void nm_Circle(long struct, IntersectionMaskCircle value) { memCopy(value.address(), struct + VROverlayIntersectionMaskPrimitiveData.M_CIRCLE, IntersectionMaskCircle.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VROverlayIntersectionMaskPrimitiveData} structs. */
    public static class Buffer extends StructBuffer<VROverlayIntersectionMaskPrimitiveData, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VROverlayIntersectionMaskPrimitiveData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayIntersectionMaskPrimitiveData#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VROverlayIntersectionMaskPrimitiveData newInstance(long address) {
            return new VROverlayIntersectionMaskPrimitiveData(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link IntersectionMaskRectangle} view of the {@code m_Rectangle} field. */
        @NativeType("IntersectionMaskRectangle_t")
        public IntersectionMaskRectangle m_Rectangle() { return VROverlayIntersectionMaskPrimitiveData.nm_Rectangle(address()); }
        /** Returns a {@link IntersectionMaskCircle} view of the {@code m_Circle} field. */
        @NativeType("IntersectionMaskCircle_t")
        public IntersectionMaskCircle m_Circle() { return VROverlayIntersectionMaskPrimitiveData.nm_Circle(address()); }

        /** Copies the specified {@link IntersectionMaskRectangle} to the {@code m_Rectangle} field. */
        public VROverlayIntersectionMaskPrimitiveData.Buffer m_Rectangle(@NativeType("IntersectionMaskRectangle_t") IntersectionMaskRectangle value) { VROverlayIntersectionMaskPrimitiveData.nm_Rectangle(address(), value); return this; }
        /** Copies the specified {@link IntersectionMaskCircle} to the {@code m_Circle} field. */
        public VROverlayIntersectionMaskPrimitiveData.Buffer m_Circle(@NativeType("IntersectionMaskCircle_t") IntersectionMaskCircle value) { VROverlayIntersectionMaskPrimitiveData.nm_Circle(address(), value); return this; }

    }

}