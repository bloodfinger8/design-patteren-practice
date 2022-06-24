package me.awakedev.designpatterns._02_structural_patterns._09_decorate._01_before;

public class TrimmingCommentService extends CommentService{
    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}
