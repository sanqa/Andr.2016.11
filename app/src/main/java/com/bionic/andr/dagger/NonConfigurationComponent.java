package com.bionic.andr.dagger;

import com.bionic.andr.MainActivity;
import com.bionic.andr.mvp.LoginActivity;

import dagger.Subcomponent;

@NonConfigurationScope
@Subcomponent
public interface NonConfigurationComponent {
    void inject(LoginActivity loginActivity);
}
