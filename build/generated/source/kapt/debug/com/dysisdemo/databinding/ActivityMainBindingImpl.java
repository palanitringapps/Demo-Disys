package com.dysisdemo.databinding;
import com.dysisdemo.R;
import com.dysisdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.dysisdemo.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of login.password
            //         is login.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // login.password
            java.lang.String loginPassword = null;
            // login != null
            boolean loginJavaLangObjectNull = false;
            // login
            com.dysisdemo.ui.login.LoginViewModel login = mLogin;



            loginJavaLangObjectNull = (login) != (null);
            if (loginJavaLangObjectNull) {




                login.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of login.username
            //         is login.setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // login != null
            boolean loginJavaLangObjectNull = false;
            // login.username
            java.lang.String loginUsername = null;
            // login
            com.dysisdemo.ui.login.LoginViewModel login = mLogin;



            loginJavaLangObjectNull = (login) != (null);
            if (loginJavaLangObjectNull) {




                login.setUsername(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            );
        this.etPassword.setTag(null);
        this.etUsername.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatButton) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.dysisdemo.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.login == variableId) {
            setLogin((com.dysisdemo.ui.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLogin(@Nullable com.dysisdemo.ui.login.LoginViewModel Login) {
        updateRegistration(0, Login);
        this.mLogin = Login;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.login);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLogin((com.dysisdemo.ui.login.LoginViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLogin(com.dysisdemo.ui.login.LoginViewModel Login, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String loginPassword = null;
        java.lang.String loginUsername = null;
        com.dysisdemo.ui.login.LoginViewModel login = mLogin;

        if ((dirtyFlags & 0x3L) != 0) {



                if (login != null) {
                    // read login.password
                    loginPassword = login.getPassword();
                    // read login.username
                    loginUsername = login.getUsername();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, loginPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, loginUsername);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // login != null
        boolean loginJavaLangObjectNull = false;
        // login
        com.dysisdemo.ui.login.LoginViewModel login = mLogin;



        loginJavaLangObjectNull = (login) != (null);
        if (loginJavaLangObjectNull) {


            login.loginUser();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): login
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}