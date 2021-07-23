package com.karan.shaadidotcom.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/karan/shaadidotcom/ui/MatchesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "weakMatchesActionsInterface", "Ljava/lang/ref/WeakReference;", "Lcom/karan/shaadidotcom/ui/MatchesActionsInterface;", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "changeStatus", "profile", "Lcom/karan/shaadidotcom/model/Profile;", "newStatus", "", "onBind", "", "setupAsMatchAccepted", "setupAsMatchDeclined", "setupAsMatchStatusUnknown", "setupMatchStatus", "matchStatus", "app_debug"})
public final class MatchesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final java.lang.ref.WeakReference<com.karan.shaadidotcom.ui.MatchesActionsInterface> weakMatchesActionsInterface = null;
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void onBind(@org.jetbrains.annotations.NotNull()
    com.karan.shaadidotcom.model.Profile profile) {
    }
    
    private final com.karan.shaadidotcom.ui.MatchesActionsInterface changeStatus(com.karan.shaadidotcom.model.Profile profile, int newStatus) {
        return null;
    }
    
    private final void setupMatchStatus(int matchStatus) {
    }
    
    private final void setupAsMatchAccepted() {
    }
    
    private final void setupAsMatchDeclined() {
    }
    
    private final void setupAsMatchStatusUnknown() {
    }
    
    public MatchesViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    java.lang.ref.WeakReference<com.karan.shaadidotcom.ui.MatchesActionsInterface> weakMatchesActionsInterface) {
        super(null);
    }
}