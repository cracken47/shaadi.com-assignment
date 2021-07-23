package com.karan.shaadidotcom.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/karan/shaadidotcom/ui/MatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/karan/shaadidotcom/ui/MatchesViewHolder;", "mainActivityViewModel", "Lcom/karan/shaadidotcom/MainActivityViewModel;", "(Lcom/karan/shaadidotcom/MainActivityViewModel;)V", "matchesActionsInterface", "Lcom/karan/shaadidotcom/ui/MatchesActionsInterface;", "matchesList", "", "Lcom/karan/shaadidotcom/model/Profile;", "weakMatchesActionsInterface", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newMatchesList", "app_debug"})
public final class MatchesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.karan.shaadidotcom.ui.MatchesViewHolder> {
    private java.util.List<com.karan.shaadidotcom.model.Profile> matchesList;
    private final com.karan.shaadidotcom.ui.MatchesActionsInterface matchesActionsInterface = null;
    private final java.lang.ref.WeakReference<com.karan.shaadidotcom.ui.MatchesActionsInterface> weakMatchesActionsInterface = null;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.karan.shaadidotcom.model.Profile> newMatchesList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.karan.shaadidotcom.ui.MatchesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.karan.shaadidotcom.ui.MatchesViewHolder holder, int position) {
    }
    
    public MatchesAdapter(@org.jetbrains.annotations.NotNull()
    com.karan.shaadidotcom.MainActivityViewModel mainActivityViewModel) {
        super();
    }
}