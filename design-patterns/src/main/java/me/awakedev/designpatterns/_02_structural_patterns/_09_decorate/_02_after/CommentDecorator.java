package me.awakedev.designpatterns._02_structural_patterns._09_decorate._02_after;

public class CommentDecorator implements CommentService{
    private CommentService commentService;
    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
