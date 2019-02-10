$answer = "";
$text = "";

my %seen;

while (my $line = <>) {
    $text = $text . $line;
}

my @list = $text =~ /<a(.*?)href=[\'\"]([^\'\"]+)[\'\"](.*?)/gx;

my @answer =();
foreach my $line (@list)
{
    $temp = $line;
    $line =~ m{^([^\/]+:\/{2}){1}([^\/@]*@)?(?<host>.*?)([\/#?:]|$)};
    $host1 = $+{host};
    $temp =~ m{^([^\/@]*@)?(?<temp1>.*?):[\d]+([\/#?:]|$)};
    $host2 = $+{temp1};
    if ($host1 =~ /([^\.]+[.][^\.]+)|[A-Za-z]{1,}/) {
        $host1 =~ s/([^:]+):.*/\1/;
        if (! $seen{$host1} and !($host1 =~ /[A-Za-z]+:[^\d]/)) {
            push @answer, $host1;
            $seen{$host1} = 1;
        }
    }
    if ($host2 =~ /([^\.]+[.][^\.]+)|[A-Za-z]{1,}/) {
        if (! $seen{$host2} and !($host2 =~ /[A-Za-z]+:[^\d]/)) {
            push @answer, $host2;
            $seen{$host2} = 1;
        }
    }
}

@sort_answer = sort @answer;

print "$_\n" for @sort_answer;